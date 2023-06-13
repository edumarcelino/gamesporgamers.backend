package br.com.gamesporgamers.entity;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Video extends PanacheEntity{

    private String urlVideo;

    private String servicePublish;

    private Date datePublish;


    public String getUrlVideo() {
        return this.urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Date getDatePublish() {
        return this.datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }


    public String getServicePublish() {
        return this.servicePublish;
    }

    public void setServicePublish(String servicePublish) {
        this.servicePublish = servicePublish;
    }


}
