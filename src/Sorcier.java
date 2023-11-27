public class Sorcier extends Personnage {
    public int intelligence;

    public Sorcier(int pv, int niv, String nom, Arme arme, int intelligence) {
        super(pv, niv, nom, arme);
        this.intelligence = intelligence;
    }

    @Override
    public void accept(VisiteurPersonnage visitor) {
        visitor.visiter(this);
    }
}
