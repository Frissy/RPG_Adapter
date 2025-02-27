public class Arme {
    private String nom;
    public Integer coeffDegats;
    public Integer coeffRessources;

    public Arme(String nom, Integer coeffDegats, Integer coeffRessources) {
        this.nom = nom;
        this.coeffDegats = coeffDegats;
        this.coeffRessources = coeffRessources;
    }

    public String getNom() {
        return nom;
    }

    public Integer getCoeffDegats() {
        return coeffDegats;
    }

    public void setCoeffDegats(Integer coeffDegats) {
        this.coeffDegats = coeffDegats;
    }

    public Integer getCoeffRessources() {
        return coeffRessources;
    }

    public void setCoeffRessources(Integer coeffRessources) {
        this.coeffRessources = coeffRessources;
    }
}
