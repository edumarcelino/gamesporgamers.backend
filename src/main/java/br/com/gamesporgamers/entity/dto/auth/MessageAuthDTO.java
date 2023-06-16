package br.com.gamesporgamers.entity.dto.auth;

public class MessageAuthDTO {
    public String content;

    public MessageAuthDTO() {
    }

    public MessageAuthDTO(String content) {
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
