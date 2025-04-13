package com.example.demojpa.repository;

import com.example.demojpa.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> findByArtist(String artist);

    List<Song> findByGenreAndArtistNot(String genre, String artist);
}
