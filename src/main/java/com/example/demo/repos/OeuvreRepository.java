package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Genre;
import com.example.demo.entities.Oeuvre;
import com.example.demo.entities.OeuvreProjection;

@RepositoryRestResource(path = "rest", excerptProjection = OeuvreProjection.class)
@CrossOrigin(origins = "http://localhost:4200")
public interface OeuvreRepository extends JpaRepository<Oeuvre, Long> {

	List<Oeuvre> findByNomOeuvre(String nom);

	List<Oeuvre> findByNomOeuvreContains(String nom);

	@Query("select o from Oeuvre o where o.nomOeuvre like concat('%', :nom, '%') and o.prixOeuvre > :prix")
	List<Oeuvre> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

	@Query("select o from Oeuvre o where o.genre = ?1")
	List<Oeuvre> findByGenre(Genre genre);

	List<Oeuvre> findByGenreIdGenre(Long id);

	List<Oeuvre> findByOrderByNomOeuvreAsc();

	@Query("select o from Oeuvre o order by o.nomOeuvre ASC, o.prixOeuvre DESC")
	List<Oeuvre> trierOeuvresNomsPrix();
}