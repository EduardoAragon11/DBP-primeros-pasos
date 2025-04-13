package com.example.demojpa.controller;

import com.example.demojpa.domain.Song;
import com.example.demojpa.exception.ErrorMessage;
import com.example.demojpa.exception.SongNotFoundException;
import com.example.demojpa.service.SongService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {
    @Autowired
    SongService service;

    @GetMapping
    public ResponseEntity<List<Song>> songs() {
        List<Song> songs = service.songs();

        return new ResponseEntity<>(songs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Song> songById(@PathVariable("id") Integer id) {
        Song song = service.songById(id);

        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    /*
    @GetMapping("/artist")
    public ResponseEntity<List<Song>> songs(@RequestParam("artist") String artist, @RequestParam("genre") String genre) {
        List<Song> songs = service.find(artist, genre);

        return new ResponseEntity<>(songs, HttpStatus.OK);
    }
    */

    @GetMapping("/artist")
    public ResponseEntity<List<Song>> songs(@RequestParam GetSongByArtistDto) {
        List<Song> songs = service.find(artist, genre);

        return new ResponseEntity<>(songs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createSong(@Valid @RequestBody CreateSongDto song) {
        service.createSong(song);

        // Patrón: Builder
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ExceptionHandler(SongNotFoundException.class)
    public ResponseEntity<ErrorMessage> handler() {
        ErrorMessage error = new ErrorMessage("error_not_found", "404");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
