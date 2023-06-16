package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
    
public User findByUsernameAndPassword(String username, String password) {
    return find("username = ?1 and password = ?2", username, password).firstResult();
}
    
}