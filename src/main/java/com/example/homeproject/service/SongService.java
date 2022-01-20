package com.example.homeproject.service;

import com.example.homeproject.model.Song;
import com.example.homeproject.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public Song saveSong(Song song){
        return songRepository.save(song);
    }

    public List<Song> saveSong(List<Song> songList){
        return songRepository.saveAll(songList);
    }

    public List<Song> findAllSongs(List<Song> songList){
        return songRepository.findAll();
    }




}
