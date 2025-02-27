abstract class TypeAttaque {
    private String nom;
    private Integer degats;
    private Integer ressources;
    private Arme arme;

    public TypeAttaque(String nom, Integer degats, Arme arme, Integer ressources) {
        this.nom = nom;
        this.degats = degats;
        this.arme = arme;
        this.ressources = ressources;
    }

    public String getNom() { return nom; }

    public Integer getRessources() {
        return ressources;
    }

    public void setRessources(Integer ressources) {
        this.ressources = ressources;
    }

    public Integer getDegats() {
        return degats;
    }

    public void setDegats(Integer degats) {
        this.degats = degats;
    }

    public Arme getArme() {
        return arme;
    }

    public Integer faireDegats() {
        return arme.coeffDegats * degats;
    }

    public Integer depenserRessources() {
        return arme.coeffRessources * this.ressources;
    }
}
