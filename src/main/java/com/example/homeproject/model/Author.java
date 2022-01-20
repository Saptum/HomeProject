package com.example.homeproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue
    private Long authorId;
    private String firstName;
    private String lastName;
    private String country;
    private String sex;
    private String email;
    private Date date;

    @JsonIgnore
    @OneToMany(mappedBy = "author")
    private Set<Song> songs = new HashSet<>();


}
