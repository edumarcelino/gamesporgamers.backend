package br.com.gamesporgamers.entity.dto;

import java.util.Date;

import br.com.gamesporgamers.entity.Post;

public class PostDTO {
    private String postText;
    private String postTextHTML;
    private Date datePost;
    private boolean highlighted;
    private int countComments;
    private int countLikes;
    private int countDislikes;

    public String getPostText() {
        return this.postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostTextHTML() {
        return this.postTextHTML;
    }

    public void setPostTextHTML(String postTextHTML) {
        this.postTextHTML = postTextHTML;
    }

    public Date getDatePost() {
        return this.datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public boolean isHighlighted() {
        return this.highlighted;
    }

    public boolean getHighlighted() {
        return this.highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    public int getCountComments() {
        return this.countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public int getCountLikes() {
        return this.countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public int getCountDislikes() {
        return this.countDislikes;
    }

    public void setCountDislikes(int countDislikes) {
        this.countDislikes = countDislikes;
    }

    // Método para mapear o DTO para a entidade Post
    public Post mapDTOtoPost() {
        Post post = new Post();
        post.setPostText(this.postText);
        post.setPostTextHTML(this.postTextHTML);
        post.setDatePost(this.datePost);
        post.setHighlighted(this.highlighted);
        return post;
    }

    // Método para mapear a entidade Post para o DTO
    public static PostDTO mapPostToDTO(Post post) {
        PostDTO dto = new PostDTO();
        dto.setPostText(post.getPostText());
        dto.setPostTextHTML(post.getPostTextHTML());
        dto.setDatePost(post.getDatePost());
        dto.setHighlighted(post.isHighlighted());
        return dto;
    }

}