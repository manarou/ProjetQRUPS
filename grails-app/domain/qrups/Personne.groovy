package qrups

abstract class Personne {

	String nom
	String prenom
	
    static constraints = {
    }
	
	Personne(String nom, String prenom) {
		this.nom = nom
		this.prenom = prenom
	}
	
	String toString() {
		nom.toUpperCase() + " " + prenom.toLowerCase()
	}
}
