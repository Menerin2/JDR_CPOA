import org.junit.jupiter.api.Test;

class DegatVisiteurTest {

    @Test
    void test(){
        testDegatRoi();
        testDegatSorcier();
        testDegatGuerrier();
        testDegatGuerisseur();
    }

    void testDegat(Personnage personnage) {
        personnage.accept(new DegatVisiteur());
        assert personnage.getArme().getDegat() == 1;
    }

    void testDegatRoi() {
        Roi roi = new Roi(0, 1, "", new Epee(),0, "");
        testDegat(roi);
    }

    void testDegatGuerrier() {
        Guerrier guerrier = new Guerrier(0, 1, "", new Epee(),0);
        testDegat(guerrier);
    }

    void testDegatGuerisseur() {
        Guerisseur guerisseur = new Guerisseur(0, 1, "", new BaguetteMagique(),0);
        testDegat(guerisseur);
    }

    void testDegatSorcier(){
        Sorcier sorcier = new Sorcier(0, 1, "", new BatonDeSorcier(),0);
        testDegat(sorcier);
    }
}