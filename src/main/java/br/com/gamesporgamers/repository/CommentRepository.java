package br.com.gamesporgamers.repository;

import br.com.gamesporgamers.entity.Comment;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class CommentRepository implements PanacheRepository<Comment> {

    public List<Comment> listAllOrderedByName() {
        return this.listAll(Sort.by("name").ascending());
    }

}