import org.junit.jupiter.api.Test;

class NiveauVisiteurTest {

    @Test
    void test(){
        testVisiterRoi();
        testVisiterSorcier();
        testVisiterGuerrier();
        testVisiterGuerisseur();
    }

    void testVisiter(Personnage personnage) {
        personnage.accept(new NiveauVisiteur());
        assert personnage.getNiveau() == 2;
    }

    void testVisiterRoi() {
        Roi roi = new Roi(0, 1, "", new Epee(),0, "");
        testVisiter(roi);
    }

    void testVisiterGuerrier() {
        Guerrier guerrier = new Guerrier(0, 1, "", new Epee(),0);
        testVisiter(guerrier);
    }

    void testVisiterGuerisseur() {
        Guerisseur guerisseur = new Guerisseur(0, 1, "", new BaguetteMagique(),0);
        testVisiter(guerisseur);
    }

    void testVisiterSorcier(){
        Sorcier sorcier = new Sorcier(0, 1, "", new BatonDeSorcier(),0);
        testVisiter(sorcier);
    }
}