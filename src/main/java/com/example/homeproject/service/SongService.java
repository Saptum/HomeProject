package com.example.homeproject.service;

import com.example.homeproject.model.Author;
import com.example.homeproject.model.Song;
import com.example.homeproject.repository.AuthorRepository;
import com.example.homeproject.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public Song saveSong(Song book) {
        return songRepository.save(book);
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

    public List<Song> getBooksByCreationDate(Date date) {
        return songRepository.findAllByCreationDate(date);
    }


    public Song updateSong(Song song) {
       Song updatedBook = songRepository.getById(song.getId());
        updatedBook.setName(song.getName());
        updatedBook.setCreationDate(song.getCreationDate());
        updatedBook.setAuthor(song.getAuthor());
        return songRepository.save(song);
    }

    public String deleteBook(Long id) {
        songRepository.deleteById(id);
        return "Song " + id + " was deleted!";
    }

    public Song addSongToAuthor(Long author_id, Long song_id) {
       Song book = songRepository.findById(song_id).orElse(null);
        Author author = authorRepository.findById(author_id).orElse(null);
        book.assignAuthor(author);
        return songRepository.save(book);
    }


}
