package Video19toStringStringBuilder.BankovniRacun;

import Video18Klase.Osoba.Osoba;

public class TestBankarskiRacun {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Zoran", "Milicevic", 1996, 189.2);
        Osoba o2 = new Osoba("Lazar", "Ugrenovic", 1994, 172);

        BankovniRacunZadatak br1 = new BankovniRacunZadatak(o1, 1000);
        BankovniRacunZadatak br2 = new BankovniRacunZadatak(o2, 0);

        BankovniRacunZadatak br3 = new BankovniRacunZadatak(o1, 1000);
        br3.toString();

        br2.isplata(100);
        System.out.println(br2);
        br1.uplata(1000);
        System.out.println(br1);

    }
}
