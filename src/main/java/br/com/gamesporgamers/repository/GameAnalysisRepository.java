package br.com.gamesporgamers.repository;

import java.util.ArrayList;
import java.util.List;
import br.com.gamesporgamers.entity.GameAnalysis;
import br.com.gamesporgamers.entity.dto.Resource.GameAnalysisResourcePagination;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@ApplicationScoped
public class GameAnalysisRepository implements PanacheRepository<GameAnalysis> {

    public GameAnalysisResourcePagination getGameAnalysisOrderedByDate(int page, int size) {

        List<GameAnalysis> analysis = new ArrayList<>();

        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<GameAnalysis> query = cb.createQuery(GameAnalysis.class);
        Root<GameAnalysis> root = query.from(GameAnalysis.class);

        query.select(root)
                .orderBy(cb.desc(root.get("datePost")));

        TypedQuery<GameAnalysis> typedQuery = getEntityManager().createQuery(query);

        // Obter a lista de GameAnalysis
        List<GameAnalysis> resultList = typedQuery.getResultList();

        // Obter o número total de resultados
        int totalResults = resultList.size();

        // Calcular o número total de páginas
        int totalPages = (int) Math.ceil((double) totalResults / size);

        // Ajustar a página se for inválida
        if (page < 1) {
            page = 1;
        } else if (page > totalPages) {
            page = totalPages;
        }

        // Calcular o offset e definir os limites da consulta
        int offset = (page - 1) * size;
        if (offset < 0) {
            offset = 0;
        }

        // Definir os Videos da página atual
        analysis = resultList.subList(offset, Math.min(offset + size, resultList.size()));

        GameAnalysisResourcePagination gameAnalysisResourcePagination = new GameAnalysisResourcePagination(analysis,
                totalPages);

        return gameAnalysisResourcePagination;
    }

}
