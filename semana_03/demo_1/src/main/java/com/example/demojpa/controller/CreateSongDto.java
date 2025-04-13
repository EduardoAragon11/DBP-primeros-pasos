package com.example.demojpa.controller;

import jakarta.validation.constraints.Size;

public class CreateSongDto {

    @Size(min = 3, max = 20)
    String title;
    String album;
    //public CreateSongDto(String title, String album) {}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
