package com.example.demo.entities;

import java.util.Date;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullOeuvre", types = { Oeuvre.class })
public interface OeuvreProjection {
	Long getIdOeuvre();
	String getNomOeuvre(); // ou getTitreOeuvre() selon votre entité Oeuvre
	Double getPrixOeuvre();
	Date getDateCreation();
	Genre getGenre();
}