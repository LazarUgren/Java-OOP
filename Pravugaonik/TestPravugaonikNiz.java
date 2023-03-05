package Video18Klase.Pravugaonik;

import java.util.Scanner;

public class TestPravugaonikNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko pravugaonika zelite da kreirate: ");
        int brojPravugaonika = sc.nextInt();



        //pravim niz pravugaonika kapaciteta = brojPravugaonika
        Pravougaonik[] nizPravugaonika = new Pravougaonik[brojPravugaonika];

        //Ovde sam kreirao taj broj pravugaonika
        for (int i = 0; i < brojPravugaonika; i++){
            System.out.println("Unesite duzinu " + (i + 1) + ". pravugaonika");
            double duzina = sc.nextDouble();

            System.out.println("Unesite sirinu " + (i + 1) + ". pravugaonika");
            double sirina = sc.nextDouble();

            Pravougaonik p = new Pravougaonik(duzina, sirina);
            nizPravugaonika[i] = p;

        }
        //Idem kroz niz kreiranih pravugaonika i ispisujem svaki zajedno sa njihovim obimom i povrsinom
        for (int i = 0; i < brojPravugaonika; i++){
            System.out.println("informacije o: " + (i + 1) + ". pravugaoniku");
            Pravougaonik p = nizPravugaonika[i];
            System.out.print(p);

        }


    }
}
