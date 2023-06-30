package br.com.gamesporgamers.service;

import br.com.gamesporgamers.entity.dto.Resource.VideoResourcePagination;

import br.com.gamesporgamers.repository.VideoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class VideoService {

    @Inject
    VideoRepository videoRepository;

    public VideoResourcePagination getVideosOrderedByDate(int page, int size) {
        return videoRepository.getVideosOrderedByDate(page, size);
    }

}
