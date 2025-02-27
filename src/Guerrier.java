public class Guerrier extends Personnage {
    private static final Integer ressourcesMax = 0;
    private static final Integer ressourcesActuelles = 0;
    private static final String typeRessource = "ressource";

    public Guerrier(String nom, Integer pointDeVieMax, Integer pointDeVie, Integer degats) {
        super(nom, pointDeVieMax, pointDeVie, ressourcesMax, ressourcesActuelles, typeRessource, degats);
    }

}
