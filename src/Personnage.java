abstract class Personnage {
    protected String nom;
    protected Integer pointDeVieMax;
    protected Integer pointDeVieActuel;
    protected Integer ressourcesMax;
    protected Integer ressourcesActuelles;
    protected String typeRessource;
    protected Integer degats;


    public Personnage(String nom, Integer pointDeVieMax, Integer pointDeVie, Integer RessourcesMax, Integer RessourcesActuelles, String typeRessource, Integer degats) {
        this.nom = nom;
        this.pointDeVieMax = pointDeVieMax;
        this.pointDeVieActuel = pointDeVie;
        this.ressourcesMax = RessourcesMax;
        this.ressourcesActuelles = RessourcesActuelles;
        this.typeRessource = typeRessource;
        this.degats = degats;
    }

    Personnage() {
    }

    public String getNom() {
        return nom;
    }

    public Integer getPointDeVieMax() {
        return pointDeVieMax;
    }

    public void setPointDeVieMax(Integer pointDeVieMax) {
        this.pointDeVieMax = pointDeVieMax;
    }

    public Integer getPointDeVieActuel() {
        return pointDeVieActuel;
    }

    public void setPointDeVieActuel(Integer pointDeVieActuel) {
        this.pointDeVieActuel = pointDeVieActuel;
    }

    public Integer getRessourcesMax() {
        return ressourcesMax;
    }

    public void setRessourcesMax(Integer ressourcesMax) {
        this.ressourcesMax = ressourcesMax;
    }

    public Integer getRessourcesActuelles() {
        return ressourcesActuelles;
    }

    public void setRessourcesActuelles(Integer ressourcesActuelles) {
        this.ressourcesActuelles = ressourcesActuelles;
    }

    public String getTypeRessource() {
        return typeRessource;
    }

    public Integer getDegats() {
        return degats;
    }

    public void setDegats(Integer ressourcesActuelles) {
        this.degats = degats;
    }

    public void attaquer(TypeAttaque attaque, Personnage victime) {
        System.out.println("Début du round : " + this.getNom() + " possède " + this.getRessourcesActuelles() + " " + this.typeRessource + " et " + this.getPointDeVieActuel() + " pv, et "+ victime.getNom() + " possède " + victime.getRessourcesActuelles() + " " + victime.typeRessource + " et " + victime.getPointDeVieActuel() + " pv.");
        System.out.println(this.getNom() + " attaque " + victime.getNom() + " avec l'attaque " + attaque.getNom() + " et l'arme " + attaque.getArme().getNom() + " !");
        victime.perdrePdv(attaque);
        this.perdreRessources(attaque);
    }

    public void perdrePdv(TypeAttaque attaque) {
        Integer nvPdv = this.getPointDeVieActuel() - attaque.faireDegats();
        System.out.println("L'attaque " + " fait " + attaque.faireDegats() + " dégats et consomme " + attaque.depenserRessources() + " ressources !");
        if (nvPdv < 0) {
            this.setPointDeVieActuel(0);
            System.out.println(this.getNom() + " est mort !");
        } else {
            this.setPointDeVieActuel(nvPdv);
            System.out.println(this.getNom() + ": " + this.getPointDeVieActuel() + " pv et " + this.getRessourcesActuelles() + " " + this.getTypeRessource());
        }
    }

    public void perdreRessources(TypeAttaque attaque) {
        Integer nvRessources = this.getRessourcesActuelles() - attaque.depenserRessources();
        this.setRessourcesActuelles(nvRessources);
        System.out.println(this.getNom() + ": " + this.getPointDeVieActuel() + " pv et " + this.getRessourcesActuelles() + " " + this.getTypeRessource());
    }

    public void attaquerAMainsNues(Personnage victime) {
        victime.setPointDeVieActuel(victime.getPointDeVieActuel() - this.degats);
        System.out.println(this.getNom() + " a attaqué " + victime.getNom() + " qui a maintenant " + victime.getPointDeVieActuel() + " pv");
    }
}
