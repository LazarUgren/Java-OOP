package Video21ZnacenjeStatic_VezbanjeZadataka.Prodavnica;

import Video18Klase.Osoba.Osoba;

import java.util.ArrayList;

/*
Klasa Racun ima sledece atribute:
Niz kupljenih proizvoda (ArrayList<Proizvod>)
Datum (String)
kupac (Osoba)
prodavac (Osoba)
Iznos (double)
Napisati konstruktor(e), gettere, settere (polje iznos moze samo da se dohvati!)
toString
Napisati metodu za dodavanje proizvoda na racun i uklanjanje proizvoda sa racuna.
format za toString:
Kupac: ime prezime
Prodavac: ime prezime
Datum: datum
Iznos: iznos
Kupljeni proizvodi:
naziv, cena
naziv, cena
naziv, cena
 */
public class Racun {
    private ArrayList <Proizvod> nizKupljenihProizvoda;
    private String datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;


    public Racun(ArrayList<Proizvod> nizKupljenihProizvoda, String datum, Osoba kupac, Osoba prodavac) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;

        this.iznos = 0;
        for (Proizvod p : nizKupljenihProizvoda){
            this.iznos = this.iznos + p.getCenaProizvoda();
        }

    }

    public Racun(String datum, Osoba kupac, Osoba prodavac) {
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.nizKupljenihProizvoda = new ArrayList<Proizvod>();
        this.iznos = 0;
    }



    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }

    public String getDatum() {
        return datum;
    }

    public Osoba getKupac() {
        return kupac;
    }

    public Osoba getProdavac() {
        return prodavac;
    }

    public double getIznos() {
        return iznos;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public void setProdavac(Osoba prodavac) {
        this.prodavac = prodavac;
    }

    public void dodajProizvod(Proizvod p){
        nizKupljenihProizvoda.add(p);
        iznos += p.getCenaProizvoda();
    }

    public void ukloniProizvod (Proizvod p){
        boolean uklonjen = nizKupljenihProizvoda.remove(p);
        if (uklonjen == true){
            iznos = iznos - p.getCenaProizvoda();
        }
        else {
            System.out.println("Izabrani proizvod se ne nalazi na racunu.");
        }
    }

    /*
    format za toString:
Kupac: ime prezime
Prodavac: ime prezime
Datum: datum
Iznos: iznos
Kupljeni proizvodi:
naziv, cena
naziv, cena
naziv, cena
     */

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Kupac: ");
        sb.append(kupac.getIme());
        sb.append(" ");
        sb.append(kupac.getPrezime());
        sb.append("\n");

        sb.append("Prodavac: ");
        sb.append(prodavac.getIme());
        sb.append(" ");
        sb.append(prodavac.getPrezime());
        sb.append("\n");

        sb.append("Datum: ");
        sb.append(datum);
        sb.append("\n");

        sb.append("Iznos: ");
        sb.append(iznos);
        sb.append("\n");

        sb.append("Kupljeni proizvodi: \n");
        for (Proizvod p : nizKupljenihProizvoda){
            sb.append(p.getNazivProizvoda());
            sb.append(" - ");
            sb.append(p.getCenaProizvoda());
            sb.append("\n");
        }

        return sb.toString();
    }


}
