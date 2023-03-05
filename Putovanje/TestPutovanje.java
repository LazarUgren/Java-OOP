package Video21ZnacenjeStatic_VezbanjeZadataka.Putovanje;

import Video18Klase.Automobil.Automobil;
import Video18Klase.Osoba.Osoba;

public class TestPutovanje {
    public static void main(String[] args) {
        Grad pariz = new Grad("Pariz", 2338924, "Francuska");
        Automobil auto = new Automobil("BMW", "Nemacka", 2021, 12350);
        Osoba vodja = new Osoba("Maja", "Savic", 1982, 173);
        Osoba putnik1 = new Osoba("Lazar", "Ugrenovic", 1994, 173);
        Osoba putnik2 = new Osoba("Milana", "Radakovic", 1995, 180);
        Osoba putnik3 = new Osoba("Nemanja", "Savic", 2002, 178);

        Putovanje p = new Putovanje(pariz, vodja, auto, 2016);

        System.out.println(p);

        p.prijava(putnik1);

        System.out.println(p);

        p.prijava(putnik2);

        System.out.println(p);

        p.prijava(putnik3);

        System.out.println(p);

        p.odjava(putnik1);

        System.out.println(p);

        p.prijava(putnik1);

        System.out.println(p);

        double brzina = 120;
        System.out.println("Vreme koje je potrebno da se stigne na destinaciju ako vozimo brzinom " + brzina + " km/h je " + p.vremeDaSeStigne(brzina) + " h.");
    }
}
