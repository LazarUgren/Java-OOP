package Video26ResenjeTestaIApachePOI.Telefonija;

public class TestTelefonija {
    public static void main(String[] args) {
        try{
            Broj b1 = new Broj("381", "63", "1234567", false);
            Broj b2 = new Broj("381", "63", "4567123", false);

            Korisnik k1 = new Korisnik("Zoran", "Milicevic", b1);
            Korisnik k2 = new Korisnik("Ljiljana", "Randjelov", b2);

            k1.posaljiPoruku("Cao Ljiljo", b2);
            k2.posaljiPoruku("Cao Zoki", b1);

            k1.posaljiPoruku("Jesi li slobodna za poziv", b2);
            k2.posaljiPoruku("Jesam", b1);

            k1.posaljiPoruku("Vazi. Evo zovem", b2);

            k1.pozovi(212, b2);

            k1.posaljiPoruku("Prekide se nesto. Ajd pozovi ti mene", b2);
            k2.posaljiPoruku("Vazi", b1);

            k2.pozovi(340, b1);

            System.out.println(k1);
            System.out.println(k2);

            System.out.println("Cena svih usluga korisnika k1: " + k1.cenaSvihUsluga());
            System.out.println("Cena svih usluga korisnika k2: " + k2.cenaSvihUsluga());

        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
