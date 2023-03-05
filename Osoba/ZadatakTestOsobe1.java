package Video18Klase.Osoba;

import java.util.Scanner;

/*
Napisati program koji od korisnika zahteva da unese imena, prezimena,
godine rodjenja i visine za 2 osobe
zatim kreirati te 2 osobe i ispisati ih.
 */
public class ZadatakTestOsobe1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //prva osoba
        System.out.println("Unesite ime prve osobe: ");
        String imePrveOsobe = sc.next();

        System.out.println("Unesite prezime druge osobe: ");
        String prezimePrveOsobe = sc.next();

        System.out.println("Unesite godinu rodjenja prve osobe: ");
        int godinaRodjenjaPrveOsobe = sc.nextInt();

        System.out.println("Unesite visinu prve osobe: ");
        double visinaPrveOsobe = sc.nextDouble();

        ZadatakOsoba1 prvaOsoba = new ZadatakOsoba1(imePrveOsobe, prezimePrveOsobe, godinaRodjenjaPrveOsobe, visinaPrveOsobe);

        //druga osoba
        System.out.println("Unesite ime druge osobe: ");
        String imeDrugeOsobe = sc.next();

        System.out.println("Unesite prezime druge osobe: ");
        String prezimeDrugeOsobe = sc.next();

        System.out.println("Unesite godinu rodjenja druge osobe: ");
        int godinaRodjenjaDrugeOsobe = sc.nextInt();

        System.out.println("Unesite visinu druge osobe: ");
        double visinaDrugeOsobe = sc.nextDouble();

        Osoba drugaOsoba = new Osoba(imeDrugeOsobe, prezimeDrugeOsobe, godinaRodjenjaDrugeOsobe, visinaDrugeOsobe);

        //ispis prve i druge osobe
        System.out.println("Ime prve osobe je: " + prvaOsoba.ime);
        System.out.println("Prezime prve osobe je: " + prvaOsoba.prezime);
        System.out.println("Godina rodjenja prve osobe je: " + prvaOsoba.godinaRodjenja);
        System.out.println("Visina prve osobe je: " + prvaOsoba.visina);

        System.out.println("Ime druge osobe je: " + drugaOsoba.getIme());
        System.out.println("Prezime druge osobe je: " + drugaOsoba.getPrezime());
        System.out.println("Godina rodjenja druge osobe je: " + drugaOsoba.getGodinaRodjenja());
        System.out.println("Visina druge osobe je: " + drugaOsoba.getVisina());

        /*
        Ispis druge metode se crveni jer sam mesto za cuvanje podataka u konstruktoru podesio na private.
        Ispis iz prve metode ne crveni jer sam upotrebio drugi konstruktor koji je podesen na public.
         */
        //drugaOsoba.visina; = 222; // da je na public, ovde bih na ovaj nacin menjao podatke.
        System.out.println("Nova visina druge oseobe je: " + drugaOsoba.getVisina());//ovde zahvaljujuci getter metodi mogu da zahvatim ime, ali ne mogu da ga menjam.

        //getter i setter metode

        drugaOsoba.setVisina(202.2); // pomocu setter metode mogu da podesim vrednost visine, tako sto cu da prosledim zeljenu vrednost.

    }
}
