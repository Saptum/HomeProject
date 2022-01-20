package com.example.homeproject.repository;

import com.example.homeproject.model.Song;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long>{

    List<Song> findAllByName(String name);

    List<Song> findAllByCreationDate(Date date);

}
