package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Genre;

@RepositoryRestResource(path = "cat")
@CrossOrigin(origins = "http://localhost:4200/") // pour autoriser Angular
public interface GenreRepository extends JpaRepository<Genre, Long> {
}