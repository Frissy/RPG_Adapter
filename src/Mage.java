public class Mage extends Personnage {

    public Mage(String nom, Integer pointDeVieMax, Integer pointDeVie, Integer ressourcesMax, Integer ressourcesActuelles, String typeRessource, Integer degats) {
        super(nom, pointDeVieMax, pointDeVie, ressourcesMax, ressourcesActuelles, typeRessource, degats);
    }

    @Override
    public void attaquer(TypeAttaque attaque, Personnage personnage) {
        super.attaquer(attaque, personnage);
    }
}
