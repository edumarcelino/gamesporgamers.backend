package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.Badge;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class BadgeRepository implements PanacheRepository<Badge> {

    public List<Badge> listAllOrderedById() {
        return this.listAll(Sort.by("id").ascending());
    }

}