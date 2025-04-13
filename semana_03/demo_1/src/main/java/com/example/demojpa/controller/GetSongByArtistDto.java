package com.example.demojpa.controller;

public class GetSongByArtistDto {
    private String artist;
    private String genre;

    public GetSongByArtistDto(String artist, String genre) {
        this.artist = artist;
        this.genre = genre;
    }

    public GetSongByArtistDto(){}

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
