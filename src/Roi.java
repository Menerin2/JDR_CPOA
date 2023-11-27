public class Roi extends Personnage {
    public int force;
    public String royaume;

    public Roi(int pv, int niv, String nom, Arme arme, int force, String royaume) {
        super(pv, niv, nom, arme);
        this.force = force;
        this.royaume = royaume;
    }

    @Override
    public void accept(VisiteurPersonnage visitor) {
        visitor.visiter(this);
    }
}
