package br.com.gamesporgamers.util;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.core.MediaType;

import java.io.InputStream;

public class ImageUploadForm {

    @FormParam("file")
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    private InputStream fileContent;

    @PartType(MediaType.TEXT_PLAIN)
    private String fileName;

    public InputStream getFileContent() {
        return fileContent;
    }

    public void setFileContent(InputStream fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}