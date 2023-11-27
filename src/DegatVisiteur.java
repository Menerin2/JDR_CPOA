public class DegatVisiteur implements VisiteurPersonnage {

    @Override
    public void visiter(Guerrier g) {
        int dgtAmeliorer = g.getArme().getDegat()+1;
        g.getArme().setDegat(dgtAmeliorer);
    }

    @Override
    public void visiter(Roi r) {
        int dgtAmeliorer = r.getArme().getDegat()+1;
        r.getArme().setDegat(dgtAmeliorer);
    }

    @Override
    public void visiter(Sorcier s) {
        int dgtAmeliorer = s.getArme().getDegat()+1;
        s.getArme().setDegat(dgtAmeliorer);
    }

    @Override
    public void visiter(Guerisseur gu) {
        int dgtAmeliorer = gu.getArme().getDegat()+1;
        gu.getArme().setDegat(dgtAmeliorer);
    }
}
