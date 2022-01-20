package com.example.homeproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue
    private UUID songId;
    private String name;
    private Date creationDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "authorId")
    private Author author;

    public void assignAuthor(Author author) {
        this.author = author;
    }
}
