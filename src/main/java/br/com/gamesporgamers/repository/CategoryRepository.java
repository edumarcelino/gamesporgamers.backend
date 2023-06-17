package br.com.gamesporgamers.repository;

import java.util.List;

import br.com.gamesporgamers.entity.Category;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoryRepository implements PanacheRepository<Category> {

    public List<Category> listAllOrderedByName() {
        return this.listAll(Sort.by("name").ascending());
    }
}
