package Video18Klase.Krug;

import java.util.Scanner;

public class TestKrugNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj krugova koji zelite da kreirate: ");
        int brojKrugova = sc.nextInt();

        Krug[] nizKrugova = new Krug[brojKrugova];

        for (int i = 0; i < brojKrugova; i++) {
            System.out.println("Uneti poluprecnik " + (i + 1) + ". kruga:");
            double poluprecnik = sc.nextDouble();

            Krug ko = new Krug(poluprecnik);
            nizKrugova[i] = ko;
        }


        for (int i = 0; i < brojKrugova; i++) {
            System.out.println("Informacije o " + (i + 1) + ". krugu:");
            Krug ko = nizKrugova[i];
            System.out.println(ko);
        }
    }
}
