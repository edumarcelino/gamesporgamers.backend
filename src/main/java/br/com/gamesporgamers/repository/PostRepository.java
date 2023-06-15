package br.com.gamesporgamers.repository;

import java.util.List;

import br.com.gamesporgamers.entity.Post;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;

public class PostRepository implements PanacheRepository<Post> {

    public List<Post> listAllOrderedByName() {
        return this.listAll(Sort.by("name").ascending());
    }

    public List<Post> findByKeyword(String keyword) {
        String keywordPattern = "%" + keyword + "%";
        return find("postText like ?1", keywordPattern).list();
    }

}
