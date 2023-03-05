package Video21ZnacenjeStatic_VezbanjeZadataka.Prodavnica;

import Video18Klase.Osoba.Osoba;

import java.util.ArrayList;

public class TestRacun {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod("Mleko", 260, 1000);
        Proizvod p2 = new Proizvod("Secer", 240, 1000);
        Proizvod p3 = new Proizvod("Brasno", 230, 1000);
        Proizvod p4 = new Proizvod("Pivo", 60, 500);
        Osoba o1 = new Osoba("Lazar", "Ugrenovic", 1994, 173);
        Osoba o2 = new Osoba("Zoran", "Milicevic", 1996, 189.2);


        //prvi nacin
        Racun r1 = new Racun("27.12.2021", o1, o2);

        r1.dodajProizvod(p1);
        System.out.println(r1);

        r1.dodajProizvod(p2);
        System.out.println(r1);

        r1.dodajProizvod(p3);
        System.out.println(r1);

        r1.dodajProizvod(p4);
        System.out.println(r1);

        r1.ukloniProizvod(p4);
        System.out.println(r1);

        r1.ukloniProizvod(p4);
        System.out.println(r1);

        // drugi nacin
        System.out.println("+++DRUGI NACIN+++");

        ArrayList<Proizvod> nizKupljenihProizvoda = new ArrayList<Proizvod>();
        nizKupljenihProizvoda.add(p1);
        nizKupljenihProizvoda.add(p2);
        nizKupljenihProizvoda.add(p3);
        nizKupljenihProizvoda.add(p4);
        Racun r2 = new Racun(nizKupljenihProizvoda, "27.12.2021", o1, o2);
        System.out.println(r2);
        r2.ukloniProizvod(p2);
        System.out.println(r2);


    }
}
