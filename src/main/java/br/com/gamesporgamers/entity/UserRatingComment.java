package br.com.gamesporgamers.entity;

import br.com.gamesporgamers.entity.enumTypes.CommentRatingEnum;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRatingComment extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Comment comment;

    @Enumerated(EnumType.STRING)
    private CommentRatingEnum postRating;

}
