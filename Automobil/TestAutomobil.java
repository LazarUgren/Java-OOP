package Video18Klase.Automobil;

public class TestAutomobil {
    public static void main(String[] args) {
        Automobil ford = new Automobil("Ford", "Nemacka", 2005, 180000.0);
        System.out.println(ford.getMarka());
        System.out.println(ford.getZemljaProizvodnje());
        System.out.println(ford.getGodiste());
        System.out.println(ford.getKilometraza());

        Automobil porse = new Automobil("911", "Nemacka", 2022, 0.0);

        System.out.println(porse.getMarka());
        System.out.println(porse.getZemljaProizvodnje());
        System.out.println(porse.getGodiste());
        System.out.println(porse.getKilometraza());

        /*
        Na ovo stavljamo dodatak o vise konstruktora i String toString metodu.
         */

        //pozvace se public Automobil(String marka, String zemljaPorekla, int godisteProizvodnje, double kilometraza}
        Automobil BMW = new Automobil("BMW", "Nemacka", 1994, 120000);
        //ovde se pozvao drugi konstruktor koji sam kreirao
        Automobil auto2 = new Automobil("Audi", "Nemacka", 2005);
        // Ovde se pozvao treci konstruktor koji sam kreirao
        Automobil auto3 = new Automobil("Nemacka", 2005, 120000.1);

        //Ovde cu da prikazem nacin na koji int ispisujem kao string i program ga razume
        //Automobil auto4 = new Automobil(String "Mercedes", String "Nemacka", String "2016", double 50000.2);
        Automobil auto4 = new Automobil("Mercedes", "Nemacka", "2016", 50000.2);

        System.out.println(BMW);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
    }

}
