package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Oeuvre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOeuvre;
	private String nomOeuvre;
	private Double prixOeuvre;
	private Date dateCreation;

	@ManyToOne
	private Genre genre;

	public Oeuvre(String nomOeuvre, Double prixOeuvre, Date dateCreation) {
		super();
		this.nomOeuvre = nomOeuvre;
		this.prixOeuvre = prixOeuvre;
		this.dateCreation = dateCreation;
	}

	public Oeuvre(String nomOeuvre, Double prixOeuvre, Date dateCreation, Genre genre) {
		super();
		this.nomOeuvre = nomOeuvre;
		this.prixOeuvre = prixOeuvre;
		this.dateCreation = dateCreation;
		this.genre = genre;
	}

	public Oeuvre() {
		super();
	}

	public Long getIdOeuvre() {
		return idOeuvre;
	}

	public void setIdOeuvre(Long idOeuvre) {
		this.idOeuvre = idOeuvre;
	}

	public String getNomOeuvre() {
		return nomOeuvre;
	}

	public void setNomOeuvre(String nomOeuvre) {
		this.nomOeuvre = nomOeuvre;
	}

	public Double getPrixOeuvre() {
		return prixOeuvre;
	}

	public void setPrixOeuvre(Double prixOeuvre) {
		this.prixOeuvre = prixOeuvre;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Oeuvre [idOeuvre=" + idOeuvre + ", nomOeuvre=" + nomOeuvre + ", prixOeuvre=" + prixOeuvre
				+ ", dateCreation=" + dateCreation + ", genre=" + genre + "]";
	}
}