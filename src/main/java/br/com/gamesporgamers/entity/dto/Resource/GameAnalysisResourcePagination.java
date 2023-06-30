package br.com.gamesporgamers.entity.dto.Resource;

import java.util.List;
import br.com.gamesporgamers.entity.GameAnalysis;

public class GameAnalysisResourcePagination {
    private List<GameAnalysis> analysis;

    private int totalPages;

    public GameAnalysisResourcePagination() {
    }

    public GameAnalysisResourcePagination(List<GameAnalysis> analysis, int totalPages) {
        this.analysis = analysis;
        this.totalPages = totalPages;
    }

    public List<GameAnalysis> getAnalysis() {
        return this.analysis;
    }

    public void setAnalysis(List<GameAnalysis> analysis) {
        this.analysis = analysis;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
