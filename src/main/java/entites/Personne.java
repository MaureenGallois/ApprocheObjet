package entites;

public class Personne {
    private String prenom;
    private String nom;
    private AdressePostale adresse ;

    public Personne(String prenom, String nom, AdressePostale adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getNom() {
        setNom(nom);
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }
}
