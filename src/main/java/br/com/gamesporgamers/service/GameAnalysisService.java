package br.com.gamesporgamers.service;

import br.com.gamesporgamers.entity.dto.Resource.GameAnalysisResourcePagination;

import br.com.gamesporgamers.repository.GameAnalysisRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GameAnalysisService {

    @Inject
    GameAnalysisRepository gameAnalysisRepository;

    public GameAnalysisResourcePagination getGameAnalysisOrderedByDate(int page, int size) {
        return gameAnalysisRepository.getGameAnalysisOrderedByDate(page, size);
    }

}
