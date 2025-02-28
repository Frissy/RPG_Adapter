public class GhostAdapter extends Personnage {
    private Ghost ghost;

    public GhostAdapter(Ghost ghost) {
        this.ghost = ghost;
        this.nom = ghost.getName();
        this.degats = ghost.getOpacity() * ghost.getFlightHeight();
    }

}
