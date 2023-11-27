public class Guerrier extends Personnage {
    public int force;

    public Guerrier(int pv, int niv, String nom, Arme arme, int force) {
        super(pv, niv, nom, arme);
        this.force = force;
    }

    @Override
    public void accept(VisiteurPersonnage visitor) {
        visitor.visiter(this);
    }
}
