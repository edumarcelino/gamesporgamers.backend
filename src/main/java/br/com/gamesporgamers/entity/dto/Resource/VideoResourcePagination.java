package br.com.gamesporgamers.entity.dto.Resource;

import java.util.List;

import br.com.gamesporgamers.entity.Video;

public class VideoResourcePagination {
    private List<Video> videos;

    private int totalPages;

    public VideoResourcePagination() {
    }

    public VideoResourcePagination(List<Video> videos, int totalPages) {
        this.videos = videos;
        this.totalPages = totalPages;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
