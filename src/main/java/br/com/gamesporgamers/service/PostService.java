package br.com.gamesporgamers.service;

import java.util.List;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.entity.dto.PostDTO;
import br.com.gamesporgamers.repository.PostRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PostService {

    @Inject
    PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.listAllOrderedByName();
    }

    public Post getPostById(Long postId) {
        return postRepository.findById(postId);
    }

    public void addPost(PostDTO postDTO) {
        // Mapear o DTO para a entidade Post
        Post post = new Post();
        post.setPostText(postDTO.getPostText());
        post.setPostTextHTML(postDTO.getPostTextHTML());
        post.setDatePost(postDTO.getDatePost());
        post.setHighlighted(postDTO.isHighlighted());
        // Mapear os demais atributos do DTO para a entidade Post

        // Persistir o post no banco de dados
        postRepository.persist(post);
    }

    public void deletePost(Post post) {
        postRepository.delete(post);
    }

    public void updatePost(Post post) {
        postRepository.persistAndFlush(post);
    }

    public List<Post> findByKeyword(String keyword) {
        return postRepository.findByKeyword(keyword);
    }

    public List<Post> findByUser(User user) {
        return postRepository.findByUser(user);
    }

}