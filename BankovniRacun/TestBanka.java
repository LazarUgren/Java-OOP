package Video19toStringStringBuilder.BankovniRacun;

import Video18Klase.Osoba.Osoba;

public class TestBanka {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Zoran", "Milicevic", 1996, 189.2);
        Osoba o2 = new Osoba("Strahinja", "Trninic", 1997, 180);
        Osoba o3 = new Osoba("Lazar", "Ugrenovic", 1994, 173);

        Banka banka = new Banka("Komercijalna", "Vojvode Stepe 72", o2);

        BankovniRacunZadatak zoranovRacun = new BankovniRacunZadatak(o1, 1200);
        banka.dodajBankovniRacun(zoranovRacun);

        BankovniRacunZadatak lazarevRacun = new BankovniRacunZadatak(o3, 800);
        banka.dodajBankovniRacun(lazarevRacun);

        System.out.println(banka);

        banka.ukloniBankovniRacun(zoranovRacun);

        System.out.println(banka);

        banka.ukloniBankovniRacun2Nacin(o1);
        banka.ukloniBankovniRacun(o2);
        banka.ukloniBankovniRacun2Nacin(o3);

        // prvi nacin gde uklanjam nije ispravan jer mi ne stampa ime...
        //ali me je spasao ukloniBankovniRacun2Nacin jer radi isto i funkcionise za razliku od prvog falicnog.



    }
}
