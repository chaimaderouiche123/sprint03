package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGenre;

	private String nomGenre;
	private String descriptionGenre;

	@OneToMany(mappedBy = "genre")
	@JsonIgnore
	@ToString.Exclude
	private List<Oeuvre> oeuvres;

	public Genre(String nomGenre, String descriptionGenre, List<Oeuvre> oeuvres) {
		super();
		this.nomGenre = nomGenre;
		this.descriptionGenre = descriptionGenre;
		this.oeuvres = oeuvres;
	}

	public Long getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}

	public String getNomGenre() {
		return nomGenre;
	}

	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}

	public String getDescriptionGenre() {
		return descriptionGenre;
	}

	public void setDescriptionGenre(String descriptionGenre) {
		this.descriptionGenre = descriptionGenre;
	}

	public List<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(List<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}
}