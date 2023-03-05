package Video21ZnacenjeStatic_VezbanjeZadataka.Prodavnica;

import Video18Klase.Osoba.Osoba;

import java.util.ArrayList;

public class TestProdavnica {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod("Mleko", 260, 1000);
        ProizvodNaStajanju pns1 = new ProizvodNaStajanju(p1, 10);

        Proizvod p2 = new Proizvod("Secer", 240, 1000);
        ProizvodNaStajanju pns2 = new ProizvodNaStajanju(p2, 12);

        Proizvod p3 = new Proizvod("Brasno", 230, 1000);
        ProizvodNaStajanju pns3 = new ProizvodNaStajanju(p3, 14);

        Proizvod p4 = new Proizvod("Pivo", 60, 500);
        ProizvodNaStajanju pns4 = new ProizvodNaStajanju(p4, 16);

        Osoba o1 = new Osoba("Lazar", "Ugrenovic", 1994, 173);
        Osoba o2 = new Osoba("Zoran", "Milicevic", 1996, 189.2);

        Prodavnica prod1 = new Prodavnica("Maxi", "Vojvode stepe");
        prod1.dodajZaposlenog(o2);
        prod1.dodajProizvod(pns1);
        prod1.dodajProizvod(pns2);
        prod1.dodajProizvod(pns3);
        prod1.dodajProizvod(pns4);

        ArrayList<Proizvod> listaZelja = new ArrayList<Proizvod>();
        listaZelja.add(p1);
        listaZelja.add(p2);
        prod1.kupovina(o1, listaZelja);

    }
}
