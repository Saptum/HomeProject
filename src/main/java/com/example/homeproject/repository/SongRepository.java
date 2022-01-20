package com.example.homeproject.repository;

import com.example.homeproject.model.Song;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song,Integer> {
}
