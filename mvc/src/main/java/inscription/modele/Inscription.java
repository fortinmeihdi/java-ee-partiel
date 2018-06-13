package inscription.modele;

import java.util.Date;

public class Inscription {

	private String prenom;
	private Date date;
	private String nom;
	
	public Inscription(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.date = new Date();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
