package br.com.gamesporgamers.service;

import java.util.List;

import br.com.gamesporgamers.entity.Badge;
import br.com.gamesporgamers.repository.BadgeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class BadgeService {

    @Inject
    BadgeRepository badgeRepository;

    public List<Badge> getAllBadges() {
        return badgeRepository.listAllOrderedById();
    }

    public Badge getBadgeById(Long badgeId) {
        return badgeRepository.findById(badgeId);
    }

    public void addBadge(Badge badge) {
        badgeRepository.persist(badge);
    }

    public void deleteBadge(Badge badge) {
        badgeRepository.delete(badge);
    }

    public void updateBadge(Badge badge) {
        badgeRepository.persistAndFlush(badge);
    }

    public List<Badge> findByNames(List<String> badgeNames) {
        return badgeRepository.findByNames(badgeNames);
    }
}