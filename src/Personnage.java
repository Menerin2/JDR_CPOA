public abstract class Personnage implements EPersonnage {
    int pointsDeVie;
    int niveau;
    String nom;
    Arme arme;

    public Personnage(int pv, int niv, String nom, Arme arme){
        this.pointsDeVie = pv;
        this.niveau = niv;
        this.nom = nom;
        this.arme = arme;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }
}
