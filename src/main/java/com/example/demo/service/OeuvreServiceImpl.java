package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Oeuvre;
import com.example.demo.repos.OeuvreRepository;

@Service
public class OeuvreServiceImpl implements OeuvreService {

	@Autowired
	OeuvreRepository oeuvreRepository;

	@Override
	public Oeuvre saveOeuvre(Oeuvre o) {
		return oeuvreRepository.save(o);
	}

	@Override
	public Oeuvre updateOeuvre(Oeuvre o) {
		return oeuvreRepository.save(o);
	}

	@Override
	public void deleteOeuvre(Oeuvre o) {
		oeuvreRepository.delete(o);
	}

	@Override
	public void deleteOeuvreById(Long id) {
		oeuvreRepository.deleteById(id);
	}

	@Override
	public Oeuvre getOeuvre(Long id) {
		return oeuvreRepository.findById(id).get();
	}

	@Override
	public List<Oeuvre> getAllOeuvres() {
		return oeuvreRepository.findAll();
	}

	@Override
	public List<Oeuvre> findByNomOeuvre(String nom) {
		return oeuvreRepository.findByNomOeuvre(nom);
	}

	@Override
	public List<Oeuvre> findByNomOeuvreContains(String nom) {
		return oeuvreRepository.findByNomOeuvreContains(nom);
	}

	@Override
	public List<Oeuvre> findByNomPrix(String nom, Double prix) {
		return oeuvreRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Oeuvre> findByGenre(Genre genre) {
		return oeuvreRepository.findByGenre(genre);
	}

	@Override
	public List<Oeuvre> findByGenreIdGenre(Long id) {
		return oeuvreRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Oeuvre> findByOrderByNomOeuvreAsc() {
		return oeuvreRepository.findByOrderByNomOeuvreAsc();
	}

	@Override
	public List<Oeuvre> trierOeuvresNomsPrix() {
		return oeuvreRepository.trierOeuvresNomsPrix();
	}
}