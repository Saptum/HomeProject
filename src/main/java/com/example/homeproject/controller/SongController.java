package com.example.homeproject.controller;

import com.example.homeproject.model.Author;
import com.example.homeproject.model.Song;
import com.example.homeproject.repository.AuthorRepository;
import com.example.homeproject.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SongController {
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    public List<Song> saveSongs(List<Song> songs) {
        return songRepository.saveAll(songs);
    }

    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    public List<Song> getSongsByName(String name) {
        return songRepository.findAllByName(name);
    }

    public List<Song> getSongsByCreationDate(Date date) {
        return songRepository.findAllByCreationDate(date);
    }


    public Song updateSong(Song song) {
        Song updatedSong = songRepository.getById(song.getId());
        updatedSong.setName(song.getName());
        updatedSong.setCreationDate(song.getCreationDate());
        updatedSong.setAuthor(song.getAuthor());
        return songRepository.save(song);
    }

    public String deleteSong(Long id) {
       songRepository.deleteById(id);
        return "Song " + id + " was deleted!";
    }

    public Song addSongToAuthor(Long author_id, Long song_id) {
        Song song = songRepository.findById(song_id).orElse(null);
        Author author = authorRepository.findById(author_id).orElse(null);
        song.assignAuthor(author);
        return songRepository.save(song);
    }




}
