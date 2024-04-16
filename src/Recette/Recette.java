package Recette;

public class Recette {
    private Long id;
    private String nom;
    private String photo;
    private String typePlat;
    private int tempsPreparation;
    private String informationsNutritionnelles;

    public Recette() {
    }

    public Recette(Long id, String nom, String photo, String typePlat, int tempsPreparation, String informationsNutritionnelles) {
        this.id = id;
        this.nom = nom;
        this.photo = photo;
        this.typePlat = typePlat;
        this.tempsPreparation = tempsPreparation;
        this.informationsNutritionnelles = informationsNutritionnelles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTypePlat() {
        return typePlat;
    }

    public void setTypePlat(String typePlat) {
        this.typePlat = typePlat;
    }

    public int getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(int tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }

    public String getInformationsNutritionnelles() {
        return informationsNutritionnelles;
    }

    public void setInformationsNutritionnelles(String informationsNutritionnelles) {
        this.informationsNutritionnelles = informationsNutritionnelles;
    }
}
