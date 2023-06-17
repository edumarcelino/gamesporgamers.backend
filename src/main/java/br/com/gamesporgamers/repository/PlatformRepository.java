package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.Platform;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class PlatformRepository implements PanacheRepository<Platform> {

    public List<Platform> listAllOrderedByName() {
        return this.listAll(Sort.by("name").ascending());
    }

}