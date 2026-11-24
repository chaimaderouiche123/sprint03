package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Oeuvre;
import com.example.demo.repos.OeuvreRepository;

@SpringBootTest
class OeuvresApplicationTests {

	@Autowired
	private OeuvreRepository oeuvreRepository;

	@Test
	public void testCreateOeuvre() {
		Oeuvre oeu = new Oeuvre("Statue Bronze", 3200.0, new Date());
		oeuvreRepository.save(oeu);
	}

	@Test
	public void testFindOeuvre() {
		Oeuvre o = oeuvreRepository.findById(1L).get();
		System.out.println(o);
	}

	@Test
	public void testUpdateOeuvre() {
		Oeuvre o = oeuvreRepository.findById(1L).get();
		o.setPrixOeuvre(2000.0);
		oeuvreRepository.save(o);
		System.out.println(o);
	}

	@Test
	public void testDeleteOeuvre() {
		oeuvreRepository.deleteById(1L);
	}

	@Test
	public void testFindAllOeuvres() {
		List<Oeuvre> oeuvres = oeuvreRepository.findAll();
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}

	@Test
	public void testFindOeuvreByNom() {
		List<Oeuvre> oeuvres = oeuvreRepository.findByNomOeuvre("Statue Bronze");
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testFindOeuvreByNomContains() {
		List<Oeuvre> oeuvres = oeuvreRepository.findByNomOeuvreContains("S");
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testFindByNomPrix() {
		List<Oeuvre> oeuvres = oeuvreRepository.findByNomPrix("Statue Bronze", 1000.0);
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testFindByGenre() {
		Genre g = new Genre();
		g.setIdGenre(1L); 
		List<Oeuvre> oeuvres = oeuvreRepository.findByGenre(g);
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testFindByGenreIdGenre() {
		List<Oeuvre> oeuvres = oeuvreRepository.findByGenreIdGenre(1L);
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testFindByOrderByNomOeuvreAsc() {
		List<Oeuvre> oeuvres = oeuvreRepository.findByOrderByNomOeuvreAsc();
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testTrierOeuvresNomsPrix() {
		List<Oeuvre> oeuvres = oeuvreRepository.trierOeuvresNomsPrix();
		for (Oeuvre o : oeuvres) {
			System.out.println(o);
		}
	}
	
}
