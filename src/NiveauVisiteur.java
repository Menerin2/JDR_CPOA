public class NiveauVisiteur implements VisiteurPersonnage {

    @Override
    public void visiter(Guerrier g) {
        int lvlUp = g.getNiveau()+1;
        g.setNiveau(lvlUp);
    }

    @Override
    public void visiter(Roi r) {
        int lvlUp = r.getNiveau()+1;
        r.setNiveau(lvlUp);
    }

    @Override
    public void visiter(Sorcier s) {
        int lvlUp = s.getNiveau()+1;
        s.setNiveau(lvlUp);
    }

    @Override
    public void visiter(Guerisseur gu) {
        int lvlUp = gu.getNiveau()+1;
        gu.setNiveau(lvlUp);
    }
}
