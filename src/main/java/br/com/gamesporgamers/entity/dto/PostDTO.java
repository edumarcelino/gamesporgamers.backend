package br.com.gamesporgamers.entity.dto;

import java.util.Date;
import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import br.com.gamesporgamers.entity.Badge;
import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.UserRatingPost;
import br.com.gamesporgamers.entity.enumTypes.PostRatingEnum;

public class PostDTO {

    @Schema(description = "ID do post (opcional, será gerado automaticamente pelo banco de dados)")
    private Long id;

    private String title;
    private String description;
    private String postText;
    private String postTextHTML;
    private Date datePost;
    private boolean highlighted;
    private String urlMainImage;
    private List<Badge> badges;

    @Schema(description = "Número de comentários", hidden = true)
    private int countComments;

    @Schema(description = "Número de curtidas", hidden = true)
    private int countLikes;

    @Schema(description = "Número de descurtidas", hidden = true)
    private int countDislikes;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public String getUrlMainImage() {
        return this.urlMainImage;
    }

    public void setUrlMainImage(String urlMainImage) {
        this.urlMainImage = urlMainImage;
    }

    public List<Badge> getBadges() {
        return this.badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
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

        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setPostText(post.getPostText());
        dto.setPostTextHTML(post.getPostTextHTML());
        dto.setDatePost(post.getDatePost());
        dto.setUrlMainImage(post.getUrlMainImage());
        dto.setHighlighted(post.isHighlighted());

        dto.setBadges(post.getBadges());

        int dislikeCounts = 0;
        for (UserRatingPost rating : post.getUserRatingsPost()) {
            if (rating.getPostRating().equals(PostRatingEnum.DISLIKE)) {
                dislikeCounts++;
            }
        }

        int likeCounts = 0;
        for (UserRatingPost rating : post.getUserRatingsPost()) {
            if (rating.getPostRating().equals(PostRatingEnum.LIKE)) {
                likeCounts++;
            }
        }

        dto.setId(post.id);
        dto.setCountComments(post.getComments().size());
        dto.setCountDislikes(dislikeCounts);
        dto.setCountLikes(likeCounts);

        return dto;
    }

}