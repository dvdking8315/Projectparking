package jpa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Parking")

public class Parking {
	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	


	@Column(name="nom")
	private String nom;

	@Column(name="adresse")
	private String adresse;

	@Column(name="prix")
	private Integer prix;

	@Column(name="superficie")
	private Integer superficie;

	@Column(name="hauteur")
	private Integer hauteur;

	@Column(name="Emplacement")
	private Integer emplacement;


	@Column(name="Passe")
	private Boolean passe;

	// Getters et setters
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getHauteur() {
		return hauteur;
	}

	public void setHauteur(Integer hauteur) {
		this.hauteur = hauteur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name="description")
	private String description;

	public Integer getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Parking() {
	}

	public Integer getId() {
		return id;
	}




	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Integer getPrix() {
		return prix;
	}


	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public Integer getEmplacement() {
		return emplacement;
	}


	public void setEmplacement(Integer emplacement) {
		this.emplacement = emplacement;
	}


	public Boolean getPasse() {
		return passe;
	}


	public void setPasse(Boolean passe) {
		this.passe = passe;
	}




}