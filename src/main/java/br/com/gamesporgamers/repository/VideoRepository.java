package br.com.gamesporgamers.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.gamesporgamers.entity.Video;
import br.com.gamesporgamers.entity.dto.Resource.VideoResourcePagination;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@ApplicationScoped
public class VideoRepository implements PanacheRepository<Video>{
    
    
    public VideoResourcePagination getVideosOrderedByDate(int page, int size) {
        
        List<Video> videos = new ArrayList<>();

        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Video> query = cb.createQuery(Video.class);
        Root<Video> root = query.from(Video.class);

        query.select(root)
                .orderBy(cb.desc(root.get("datePublish")));

        TypedQuery<Video> typedQuery = getEntityManager().createQuery(query);

        // Obter a lista de Videos
        List<Video> resultList = typedQuery.getResultList();

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
        videos = resultList.subList(offset, Math.min(offset + size, resultList.size()));

        VideoResourcePagination videosResourcePagination = new VideoResourcePagination(videos, totalPages);

        return videosResourcePagination;
    }

}
