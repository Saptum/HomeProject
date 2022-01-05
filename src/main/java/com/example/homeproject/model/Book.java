package com.example.homeproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Book {
    @Id
    private Long id;
    private String name;
    private int pages;
    private String author;



}
