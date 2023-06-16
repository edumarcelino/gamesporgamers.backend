package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.Category;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class CommentRepository implements PanacheRepository<Category> {

    public List<Category> listAllOrderedByName() {
        return this.listAll(Sort.by("name").ascending());
    }

}