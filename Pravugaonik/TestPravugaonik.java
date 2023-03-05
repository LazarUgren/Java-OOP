package Video18Klase.Pravugaonik;

import java.util.Scanner;

public class TestPravugaonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu pravugaonika: ");
        double duzina = sc.nextDouble();
        System.out.println("Unesite sirinu pravugaonika: ");
        double sirina = sc. nextDouble();

        Pravougaonik prav = new Pravougaonik(duzina, sirina);

        System.out.println("Duzina pravugaonika je: " + prav.getDuzina());
        System.out.println("Sirina pravugaonika je: " + prav.getSirina());
        System.out.println("Obim pravugaonika je: " + prav.obim());
        System.out.println("Povrsina pravugaonika je: " + prav.povrsina());
        System.out.println("\n");



        Pravougaonik kriv = new Pravougaonik(6, 12);
        System.out.println(kriv);
    }
}
