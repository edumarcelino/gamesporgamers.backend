package br.com.gamesporgamers.repository;

import java.util.List;


import br.com.gamesporgamers.entity.SubCategory;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubCategoryRepository implements PanacheRepository<SubCategory>{
    
    public List<SubCategory> listAllOrderedByName() {
        return this.listAll(Sort.by("name").ascending());
    }
}
