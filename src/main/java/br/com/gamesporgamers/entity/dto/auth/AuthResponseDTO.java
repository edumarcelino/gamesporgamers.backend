package br.com.gamesporgamers.entity.dto.auth;

public class AuthResponseDTO {

    public String accessToken;

    public AuthResponseDTO() {
    }

    public AuthResponseDTO(String token) {
        this.accessToken = token;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String token) {
        this.accessToken = token;
    }

    @Override
    public String toString() {
        return "{" +
                " accessToken='" + getAccessToken() + "'" +
                "}";
    }

}
