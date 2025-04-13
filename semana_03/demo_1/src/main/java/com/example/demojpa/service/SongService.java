package com.example.demojpa.service;

import com.example.demojpa.controller.CreateSongDto;
import com.example.demojpa.controller.GetSongByArtistDto;
import com.example.demojpa.domain.Song;
import com.example.demojpa.exception.SongNotFoundException;
import com.example.demojpa.repository.SongRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    @Autowired
    SongRepository repository;
    public ModelMapper mapper = new ModelMapper();

    public List<Song> songs() {
        return repository.findAll();
    }

    public Song songById(Integer id) {
        return repository.findById(id).orElseThrow(SongNotFoundException::new);
    }

    public void createSong(CreateSongDto songData) {
        //Dto -> Entity
        Song song = mapper.map(songData, Song.class);//
        repository.save(song);
    }

    public GetSongByArtistDto songs(Song songData) {
        //Entity -> Dto
        GetSongByArtistDto song = mapper.map(Song.class, songData);//
        return
    }


    public List<Song> findByArtist(String artist) {
        return repository.findByArtist(artist);
    }

    public List<Song> find(String artist, String genre) {
        return repository.findByGenreAndArtistNot(genre, artist);
    }
}
