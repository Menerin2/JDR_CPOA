public interface VisiteurPersonnage {
    void visiter(Guerrier g);
    void visiter(Roi r);
    void visiter(Sorcier s);
    void visiter(Guerisseur gu);
}
