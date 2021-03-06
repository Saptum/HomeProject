package com.example.homeproject.repository;

import com.example.homeproject.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findAllByFirstName(String name);

    List<Author> findAllByLastName(String lastName);

    List<Author> findByFirstNameAndLastName(String firstName, String lastName);

    List<Author> findAllByCountry(String country);

    List<Author> findAllBySex(String sex);

    List<Author> findAllByDate(Date birth);

    @Query("select a from Author a where a.email = ?1")
    Author findByEmail(String email);

}
