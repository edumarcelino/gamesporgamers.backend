package br.com.gamesporgamers.util;

import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.eclipse.microprofile.jwt.JsonWebToken;

import br.com.gamesporgamers.entity.enumTypes.Role;
import io.smallrye.jwt.auth.principal.JWTParser;
import io.smallrye.jwt.build.Jwt;
import io.smallrye.jwt.build.JwtClaimsBuilder;

@ApplicationScoped
public class TokenUtils {

	@Inject
    JWTParser jwtParser;


	public static String generateToken(String username, Set<Role> roles, Long duration, String issuer)
			throws Exception {
		String privateKeyLocation = "/privatekey.pem";
		PrivateKey privateKey = readPrivateKey(privateKeyLocation);

		JwtClaimsBuilder claimsBuilder = Jwt.claims();
		long currentTimeInSecs = currentTimeInSecs();

		Set<String> groups = new HashSet<>();
		for (Role role : roles)
			groups.add(role.toString());

		claimsBuilder.issuer(issuer);
		claimsBuilder.subject(username);
		claimsBuilder.issuedAt(currentTimeInSecs);
		claimsBuilder.expiresAt(currentTimeInSecs + duration);
		claimsBuilder.groups(groups);

		return claimsBuilder.jws().keyId(privateKeyLocation).sign(privateKey);
	}

	public static PrivateKey readPrivateKey(final String pemResName) throws Exception {
		try (InputStream contentIS = TokenUtils.class.getResourceAsStream(pemResName)) {
			byte[] tmp = new byte[4096];
			int length = contentIS.read(tmp);
			return decodePrivateKey(new String(tmp, 0, length, "UTF-8"));
		}
	}

	public static PrivateKey decodePrivateKey(final String pemEncoded) throws Exception {
		byte[] encodedBytes = toEncodedBytes(pemEncoded);

		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodedBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(keySpec);
	}

	public static byte[] toEncodedBytes(final String pemEncoded) {
		final String normalizedPem = removeBeginEnd(pemEncoded);
		return Base64.getDecoder().decode(normalizedPem);
	}

	public static String removeBeginEnd(String pem) {
		pem = pem.replaceAll("-----BEGIN (.*)-----", "");
		pem = pem.replaceAll("-----END (.*)----", "");
		pem = pem.replaceAll("\r\n", "");
		pem = pem.replaceAll("\n", "");
		return pem.trim();
	}

	public static int currentTimeInSecs() {
		long currentTimeMS = System.currentTimeMillis();
		return (int) (currentTimeMS / 1000);
	}

	public JsonWebToken parseToken(String token) throws Exception {
		return jwtParser.parse(token);
	}

	public String getUsernameFromToken(String token) throws Exception {
		JsonWebToken jwt = parseToken(token);
		return jwt.getName(); // ou jwt.getClaim(Claims.upn.name());
	}

	public Set<String> getRolesFromToken(String token) throws Exception {
		JsonWebToken jwt = parseToken(token);
		return jwt.getGroups();
	}
}