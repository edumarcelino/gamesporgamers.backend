package br.com.gamesporgamers.service;

import java.util.List;

import br.com.gamesporgamers.entity.Platform;
import br.com.gamesporgamers.repository.PlatformRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PlatformService {

    @Inject
    PlatformRepository platformRepository;

    public List<Platform> getAllPlatforms() {
        return platformRepository.listAllOrderedByName();
    }

    public Platform getPlatformById(Long platformId) {
        return platformRepository.findById(platformId);
    }

    public void addPlatform(Platform platform) {
        platformRepository.persist(platform);
    }

    public void deletePlatform(Platform platform) {
        platformRepository.delete(platform);
    }

    public void updatePlatform(Platform platform) {
        platformRepository.persistAndFlush(platform);
    }

}