package Video18Klase.Automobil;
/*
Napisati klasu Automobil, koja treba da ima sledece atribute:
marka, zemljaProizvodnje, godiste, kilometraza
Napisati test program u kome treba napraviti dva automobila i
ispisati i ispisati ih na izlaz.
 */

/*
!!!VAZNO!!!VAZNO!!!VAZNO!!!
Konstruktora u jednoj klasi (u kojoj su konstruktori) moze ih biti vise.
Oni su razliciti po broju vrednosti koje su im prosledjene...
npr.
ovaj konstruktor ima 4 vrednosti, moze se napraviti ispod njega konstruktor koji ne sadrzi marku.
to bi bio konstruktor sa tri vrednost...
kada mi u test slucaju pokrenemo program, mi prosledjujemo podatke, softver prvo izoluje sve one
konstruktore koji imaju isti broj prosledjenih podataka (u ovo slucaju tri), zatim pogleda
koji su to prosledjeni podaci i trazi konstruktor sa tim definisanim vrednostima...
tipa mi smo izostavili marku, a postoji konstruktor koji sadrzi marku, a nema kilometrazu...
taj konstruktor nije, onaj koji jeste je onaj koji ima 2,3 i 4 vrednost...
mesto proizvodnje, godiste, i kilometrazu.
 */

import Video18Klase.Osoba.Osoba;

public class Automobil {
    private String marka;
    private String zemljaProizvodnje;
    private int godiste;
    private double kilometraza;
    private Osoba vlasnik;

    public Automobil(String marka, String zemljaProizvodnje, int godiste, double kilometraza, Osoba vlasnik) {
        this.marka = marka;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.godiste = godiste;
        this.kilometraza = kilometraza;
        this.vlasnik = vlasnik;//Ako se napise this.vlasnik = null; onda se pod tim misli da se navodi
        //da auto nema vlasnika jer se ne navode nikakvi podatci o njemu, to cu demonstrirati na sledecem
        //konstruktoru
    }

    public Automobil(String marka1, String zemljaProizvodnje1, int godiste1, double kilometraza1){
        marka = marka1;
        zemljaProizvodnje = zemljaProizvodnje1;
        godiste = godiste1;
        kilometraza = kilometraza1;
        this.vlasnik = null;// Dakle, po pitanju vlasnika ovaj auto je bez vlasnika.
    }
    public Automobil(String marka, String zemljaProizvodnje, String godiste, double kilometraza){
        this.marka = marka;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.godiste = Integer.parseInt(godiste);
        this.kilometraza = kilometraza;
    }
    public Automobil(String marka1, String zemljaProizvodnje1, int godiste1){
        marka = marka1;
        zemljaProizvodnje = zemljaProizvodnje1;
        godiste = godiste1;
    }
    public Automobil(String zemljaProizvodnje1, int godiste1, double kilometraza1){
        zemljaProizvodnje = zemljaProizvodnje1;
        godiste = godiste1;
        kilometraza = kilometraza1;
    }
    //
    public String getMarka (){
        return marka;
    }
    public void setMarka (String marka1){
        marka = marka1;
    }
    //
    public String getZemljaProizvodnje (){
        return zemljaProizvodnje;
    }
    public void setZemljaProizvodnje (String zemljaProizvodnje1){
        zemljaProizvodnje = zemljaProizvodnje1;
    }
    //
    public int getGodiste (){
        return godiste;
    }
    public void setGodiste (int godiste1) {
        godiste = godiste1;
    }
    //
    public double getKilometraza (){
        return kilometraza;
    }
    public void setKilometraza (double kilometraza1){
        kilometraza = kilometraza1;
    }

   // public String toString() {
        /*
        String stringKojiVracam;
        stringKojiVracam = "Marka automobila je: " + marka + "\n";
        stringKojiVracam += "Zemlja proizvodnje automobila je: " + zemljaProizvodnje + "\n";
        stringKojiVracam += "Godina proizvodnje automobila je: " + godiste + "\n";
        stringKojiVracam += "Automobil je presao: " + kilometraza + " km" + "\n";
        return stringKojiVracam;
         */

    //    StringBuilder sb = new StringBuilder();
    //    sb.append("Marka automobila je: " + marka + "\n");
   //     sb.append("Zemlja proizvodnje automobila je: " + zemljaProizvodnje + "\n");
  //      sb.append("Godina proizvodnje automobila je: " + godiste + "\n");
   //     sb.append("Automobil je presao: " + kilometraza + "\n");
   //     return sb.toString();
 //   }

    /*
    Kada pisemo string, uvek kada koristimo + mi vrsimo neku vrstu kopiranja i stvaramo utrosak u memoriji,
    najidealnije bi bilo kada se plusevi ne bi koristili, ali to nekada nije moguce.
    Ali, kada je moguce najbolja praksa bi bila pisati String za stampu na ovaj nacin dole.
     */

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je: ");
        sb.append(marka);
        sb.append("\n");

        sb.append("Zemlja proizvodnje automobila je: ");
        sb.append(zemljaProizvodnje);
        sb.append("\n");

        sb.append("Godina proizvodnje automobila je: ");
        sb.append(godiste);
        sb.append("\n");

        sb.append("Automobil je presao: ");
        sb.append(kilometraza);
        sb.append("\n");

        if (vlasnik == null){
            sb.append("Vlasnik ne postoji");
        }
        else {
            sb.append("Ime vlasnika je: ");
            sb.append(vlasnik.getIme());
            sb.append("\n");
            sb.append("Prezime vlasnika je: ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");
            sb.append("Godina rodjenja vlasnika je: ");
            sb.append(vlasnik.getGodinaRodjenja());
            sb.append("\n");
            sb.append("Visina vlasnika je: ");
            sb.append(vlasnik.getVisina());
            sb.append("\n");
            //sb.append(vlasnik.toString()); Ako ovo ispisem, program ce ici direktno u karticu osoba i izvuci
            //ime osobe je: marko, sto nije najkorektnije jer u ovim okolnostima trebamo da imamo ime vlasnika
            //tj. bitna je forma u kojoj je tekst izlozen, pa da imamo konstruktor o osobi koja se naziva
            //"Vlasnik" to bi bilo idealno, ali buduci da nije tako, onda ovde pravimo odgovarajuce Stringove i
            //samo zahvatamo podatke o odredjenoj osobi.

        }


        return sb.toString();
    }



}
