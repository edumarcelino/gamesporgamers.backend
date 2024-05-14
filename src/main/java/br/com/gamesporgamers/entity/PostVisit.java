package br.com.gamesporgamers.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;

@Entity
public class PostVisit extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Min(0)
    private long visitCount;

    public PostVisit() {
        this.visitCount = 0;
    }

    public PostVisit(Post post) {
        this.post = post;
        this.visitCount = 0;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(long visitCount) {
        this.visitCount = visitCount;
    }

    public synchronized void incrementVisitCount() {
        this.visitCount++;
    }
}