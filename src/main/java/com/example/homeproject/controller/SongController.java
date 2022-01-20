package com.example.homeproject.controller;


import com.example.homeproject.model.Song;


import com.example.homeproject.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping("/saveSong")
    public Song saveBook(@RequestBody Song song) {
        return songService.saveSong(song);
    }

    @PostMapping("/saveSongs")
    public List<Song> saveBooks(@RequestBody List<Song> songs) {
        return songService.saveSongs(songs);
    }

    @GetMapping("/getSongs")
    public List<Song> getSongs(){
        return songService.getSongs();
    }

    @GetMapping("/getSongById/{id}")
    public Song getSongById(@PathVariable Long id) {
        return songService.getSongById(id);
    }

    @GetMapping("/getupdateSongsByName/{name}")
    public List<Song> getSongsByName(@PathVariable String name) {
        return songService.getSongsByName(name);
    }

    @GetMapping("/getSongsByDate/{date}")
    public List<Song> getSongsByCreationDate(@PathVariable Date date){
        return songService.getSongsByCreationDate(date);
    }


    @PutMapping("/updateSong")
    public Song updateSong(@RequestBody Song song) {
        return songService.updateSong(song);
    }

    @PutMapping("book/{song_id}/author/{author_id}")
    public Song assignSongToAuthor(@PathVariable Long song_id, @PathVariable Long author_id) {
        return songService .addSongToAuthor(author_id, song_id);
    }


    @DeleteMapping("/deleteSong/{id}")
    public String deleteSong(@PathVariable Long id) {
        return songService.deleteSong(id);
    }



}
