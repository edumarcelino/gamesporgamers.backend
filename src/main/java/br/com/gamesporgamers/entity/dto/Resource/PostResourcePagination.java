package br.com.gamesporgamers.entity.dto.Resource;

import java.util.List;

import br.com.gamesporgamers.entity.Post;

public class PostResourcePagination {
    private List<Post> posts;

    private int totalPages;

    public PostResourcePagination() {
    }

    public PostResourcePagination(List<Post> posts, int totalPages) {
        this.posts = posts;
        this.totalPages = totalPages;
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
