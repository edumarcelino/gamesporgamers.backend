package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.SubCategory;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubCategoryRepository implements PanacheRepository<SubCategory>{
    
}
