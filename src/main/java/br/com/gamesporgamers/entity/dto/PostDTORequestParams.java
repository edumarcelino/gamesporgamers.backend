package br.com.gamesporgamers.entity.dto;

import java.util.List;

public class PostDTORequestParams {
    private List<String> badgesNames;
    private int page;
    private int size;

    public List<String> getBadgesNames() {
        return this.badgesNames;
    }

    public void setBadgesNames(List<String> badgesNames) {
        this.badgesNames = badgesNames;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}