package br.com.gamesporgamers.entity.dto;

public class MessageDTO {

    public String content;

    public MessageDTO() {
    }

    public MessageDTO(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "{" +
                " content='" + getContent() + "'" +
                "}";
    }

}
