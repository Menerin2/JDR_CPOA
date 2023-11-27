public class Guerisseur extends Personnage {
    public int sagesse;

    public Guerisseur(int pv, int niv, String nom, Arme arme, int sagesse) {
        super(pv, niv, nom, arme);
        this.sagesse = sagesse;
    }

    @Override
    public void accept(VisiteurPersonnage visitor) {
        visitor.visiter(this);
    }
}
