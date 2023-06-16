package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.util.PBKDF2Encoder;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    @Inject
    PBKDF2Encoder passwordEncoder;

    public User findByUsernameAndPassword(String username, String password) {
        return find("username = ?1 and password = ?2", username, passwordEncoder.encode(password)).firstResult();
    }

}