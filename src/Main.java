import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // Définition des persos
//        Guerrier guerrier = new Guerrier("Ptit chat", 50, 50);
//        Mage mage = new Mage("Gros chat", 100, 100, 200, 200, "mana");
//
//        // Définition des armes
//        Arme batonDeSorcier = new Arme("Bâton de sorcier", 4, 2);
//        Arme griffe = new Arme("Griffes", 3, 0);
//
//        // Définition des attaques
//        AttaqueMagique empoisonner = new AttaqueMagique("Miaou empoisonné", 10, batonDeSorcier,  25);
//        AttaquePhysique coupDeGriffe = new AttaquePhysique("Coup de Griffe" , 15, griffe, 0);
//
//
//        // Combat
//        ArrayList<Runnable> actions = new ArrayList<>();
//        actions.add(() ->mage.attaquer(empoisonner, guerrier));
//        actions.add(() -> guerrier.attaquer(coupDeGriffe, mage));
//
//        while (mage.getPointDeVieActuel() > 0 && guerrier.getPointDeVieActuel() > 0) {
//            actions.get((int) Math.floor(Math.random() * 2)).run();
//        }
        // Définition des persos
        Guerrier jeanne = new Guerrier("Jeanne", 100, 100, 25);
        Mage margaux = new Mage("Margaux", 80, 80, 50, 50, "mana", 20);

        // Attaque personnage sur personnage
        jeanne.attaquerAMainsNues(margaux);

        // Définition du ghost
        Ghost malo = new Ghost("MaloéLeGhost", 189, 150, 30);
        // Attaque ghost sur personnage
        malo.attaquerAMainsNues(margaux);

//        personnageToGhostAdapter.attaquer()

    }

}