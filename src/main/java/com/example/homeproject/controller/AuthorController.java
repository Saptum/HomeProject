package com.example.homeproject.controller;

import com.example.homeproject.model.Author;
import com.example.homeproject.model.Song;
import com.example.homeproject.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/saveAuthor")
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @PostMapping("/saveAuthors")
    public List<Author> saveAuthor(@RequestBody List<Author> authors){
        return authorService.saveAuthor(authors);
    }

    @PostMapping("/addBook/{id}")
    public Author addBook(@PathVariable Long id, @RequestBody Song song) {
        return authorService.addSongs(song, id);
    }

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/authorById/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @GetMapping("/authorByFirstName/{firstName}")
    public List<Author> getAuthorsByFirstName(@PathVariable String firstName) {
        return authorService.getAuthorsByFirstName(firstName);
    }

    @GetMapping("/authorByLastName/{lastName}")
    public List<Author> getAuthorsByLastName(@PathVariable String lastName) {
        return authorService.getAuthorsByLastName(lastName);
    }

    @GetMapping("/authorsByFirstNameAndLastName/{firstName}/{lastName}")
    public List<Author> getAuthorsByFirstNameAndLastName(@PathVariable String firstName, String lastName){
        return authorService.getAuthorsByFirstNameAndLastName(firstName,lastName);
    }

    @GetMapping("/authorByCountry/{country}")
    public List<Author> getAuthorsByCountry(@PathVariable String country) {
        return authorService.getAuthorsByCountry(country);
    }

    @GetMapping("/authorBySex/{sex}")
    public List<Author> getAuthorsBySex(@PathVariable String sex) {
        return authorService.getAuthorsBySex(sex);
    }

    @GetMapping("/authorByBirth/{birth}")
    public List<Author> getAuthorsByBirth(@PathVariable Date birth) {
        return authorService.getAuthorsByBirth(birth);
    }

    @PutMapping("/updateAuthor")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        return authorService.deleteAuthor(id);
    }
}
