package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    public User findByUsername(String username) {
        return find("username = ?1 ", username).firstResult();
    }

}