package br.com.gamesporgamers.dto;

public class AuthResponseDTO {

    public String token;

    public AuthResponseDTO() {
    }

    public AuthResponseDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "{" +
                " token='" + getToken() + "'" +
                "}";
    }

}
