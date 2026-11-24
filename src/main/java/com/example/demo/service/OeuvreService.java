package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Oeuvre;

public interface OeuvreService {
	Oeuvre saveOeuvre(Oeuvre o);
	Oeuvre updateOeuvre(Oeuvre o);
	void deleteOeuvre(Oeuvre o);
	void deleteOeuvreById(Long id);
	Oeuvre getOeuvre(Long id);
	List<Oeuvre> getAllOeuvres();
	
	List<Oeuvre> findByNomOeuvre(String nom);
	List<Oeuvre> findByNomOeuvreContains(String nom);
	List<Oeuvre> findByNomPrix(String nom, Double prix);
	List<Oeuvre> findByGenre(Genre genre);
	List<Oeuvre> findByGenreIdGenre(Long id);
	List<Oeuvre> findByOrderByNomOeuvreAsc();
	List<Oeuvre> trierOeuvresNomsPrix();
}