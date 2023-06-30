package br.com.gamesporgamers.entity.dto.Request;

public class PaginatioRequestParams {
    private int page;
    private int size;


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