package Video18Klase.Automobil;

import java.util.Scanner;

public class ZadatakAutomobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //prvi auto
        System.out.println("Unesite marku prvog automobila: ");
        String markaPrvogAutomobila = sc.next();
        System.out.println("Unesite zemlju proizvodnje prvog automobila: ");
        String zemljaProizvodnjePrvogAutomobila = sc.next();
        System.out.println("Unesite godiste prvog automobila: ");
        int godistePrvogAutomobila = sc.nextInt();
        System.out.println("Unesite kilometrazu prvog automobila: ");
        double kilometrazaPrvogAutomobila = sc.nextDouble();

        Automobil prviAutomobil = new Automobil(markaPrvogAutomobila, zemljaProizvodnjePrvogAutomobila, godistePrvogAutomobila, kilometrazaPrvogAutomobila);

        //drugi auto
        System.out.println("Unesite marku drugog automobila: ");
        String markaDrugogAutomobila = sc.next();
        System.out.println("Unesite zemlju proizvodnje drugog automobila: ");
        String zemljaProizvodnjeDrugogAutomobila = sc.next();
        System.out.println("Unesite godiste drugog automobila: ");
        int godisteDrugogAutomobila = sc.nextInt();
        System.out.println("Unesite kilometrazu drugog automobila: ");
        double kilometrazaDrugogAutomobila = sc.nextDouble();

        Automobil drugiAutomobil = new Automobil(markaDrugogAutomobila, zemljaProizvodnjeDrugogAutomobila, godisteDrugogAutomobila, kilometrazaDrugogAutomobila);

        //ispis prvi i drugi auto

        System.out.println("Marka prvog automobila je: " + prviAutomobil.getMarka());
        System.out.println("Zemlja proizvodnje prvog automobila je: " + prviAutomobil.getZemljaProizvodnje());
        System.out.println("Godiste prvog automobila je: " + prviAutomobil.getGodiste());
        System.out.println("Kilometraza prvog automobila je: " + prviAutomobil.getKilometraza());

        System.out.println("Marka drugog automobila je: " + drugiAutomobil.getMarka());
        System.out.println("Zemlja proizvodnje drugog automobila je:" + drugiAutomobil.getZemljaProizvodnje());
        System.out.println("Godiste drugog automobila je: " + drugiAutomobil.getGodiste());
        System.out.println("Kilometraza drugog automobila je: " + drugiAutomobil.getKilometraza());






    }
}
