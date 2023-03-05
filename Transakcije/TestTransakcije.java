package Video25VezbanjeZaTest.Transakcije;
/*
Napisati test program (main metodu), u kojoj je potrebno
    - napraviti nekoliko datuma
    - napraviti banku (ukljucujuci i racun za banku)
    - napraviti jos dva racuna
    - napraviti nekoliko zahteva za transfer (kredita i uplatnica), dodati ih u banku i izvrsiti nekoliko
    - ispisati sve racune
    - ispisati banku
 */
public class TestTransakcije {
    public static void main(String[] args) {
        try {
            Datum d1 = new Datum(11,12,2012);
            Datum d2 = new Datum(12,12,2012);
            Datum d3 = new Datum(13,12,2012);
            Datum d4 = new Datum(14,12,2012);

            Racun r1 = new Racun(1000,100);
            Racun r2 = new Racun(2000,200);
            Racun r3 = new Racun(3000,300);

            Banka b = new Banka("Komercijalna banka", r1);

            KreditniZahtev kz1 = new KreditniZahtev(r1, r2, d1, 900, d2, d3);
            Uplatnica u1 = new Uplatnica(r3, r1, d4, 300, "Kurve");

            b.dodajZahtev(kz1);
            b.dodajZahtev(u1);

            b.izvrsiZahtev();
            b.izvrsiZahtev();

            System.out.println(b);
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }

    }
}
