package appli.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Biere {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private float degre;

	protected Biere() {
	}

	public Biere(String nom, float degre) {
		this.nom = nom;
		this.degre = degre;

	}

	@Override
	public String toString() {
		return String.format("Biere[id=%d, nom='%s', degre='%.1f']", id, nom,
				degre);
	}
}
