package br.com.gamesporgamers.entity.dto.Request;

import java.util.List;

public class PostDTORequestParams extends PaginatioRequestParams {
    
    private List<String> badgesNames;

    public List<String> getBadgesNames() {
        return this.badgesNames;
    }

    public void setBadgesNames(List<String> badgesNames) {
        this.badgesNames = badgesNames;
    }

}