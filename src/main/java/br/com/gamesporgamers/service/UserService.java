package br.com.gamesporgamers.service;

import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.entity.dto.auth.AuthRequestDTO;

import br.com.gamesporgamers.repository.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository;

    public User findByUsername(AuthRequestDTO authRequest) {
        return userRepository.findByUsername(authRequest.getUsername());
    }

    public void addUser(User user) {
        userRepository.persist(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public void updateCategory(User user) {
        userRepository.persistAndFlush(user);
    }

}