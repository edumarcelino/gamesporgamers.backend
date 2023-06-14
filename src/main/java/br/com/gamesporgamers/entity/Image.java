package br.com.gamesporgamers.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class Image extends PanacheEntity {
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

}
