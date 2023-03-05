package Video21ZnacenjeStatic_VezbanjeZadataka.Prodavnica;

import Video18Klase.Osoba.Osoba;

import java.util.ArrayList;

/*
Klasa Prodavnica koja poseduje sledeca polja/atribute:
Naziv prodavnice (String)
Ulica (String)
Niz zaposlenih (arrayList<Osoba>)
Niz proizvoda na stanju (arrayList<ProizvodNaStajanju>)
Niz obavljenih kupovina (arrayList<Racun>)

Napisati konstruktor, nizovi neka budu inicijalno prazni, gettere i settere, toString.

Napisati metodu za dodavanje i uklanjanje zaposlenjih.

Napisati metodu za dodavanje proizvoda na stajanju, ako proizvod vec postoji
na stajanju, samo uvecati kolicinu koja se nalazi na stajanju.

Napisati metodu koja prima osobu i niz proizvoda koje ta osoba zeli da kupi
i vraca kreirani racun.
 */
public class Prodavnica {
    private String nazivProdavnice;
    private String ulica;
    private ArrayList<Osoba> nizZaposlenih;
    private ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju;
    private ArrayList<Racun> nizObavljenihKupovina;

    public Prodavnica(String nazivProdavnice, String ulica) {
        this.nazivProdavnice = nazivProdavnice;
        this.ulica = ulica;

        nizZaposlenih = new ArrayList<Osoba>();
        nizProizvodaNaStajanju = new ArrayList<ProizvodNaStajanju>();
        nizObavljenihKupovina = new ArrayList<Racun>();
    }

    public String getNazivProdavnice() {
        return nazivProdavnice;
    }

    public void setNazivProdavnice(String nazivProdavnice) {
        this.nazivProdavnice = nazivProdavnice;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public ArrayList<Osoba> getNizZaposlenih() {
        return nizZaposlenih;
    }

    public void setNizZaposlenih(ArrayList<Osoba> nizZaposlenih) {
        this.nizZaposlenih = nizZaposlenih;
    }

    public ArrayList<ProizvodNaStajanju> getNizProizvodaNaStajanju() {
        return nizProizvodaNaStajanju;
    }

    public void setNizProizvodaNaStajanju(ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju) {
        this.nizProizvodaNaStajanju = nizProizvodaNaStajanju;
    }

    public ArrayList<Racun> getNizObavljenihKupovina() {
        return nizObavljenihKupovina;
    }

    public void setNizObavljenihKupovina(ArrayList<Racun> nizObavljenihKupovina) {
        this.nizObavljenihKupovina = nizObavljenihKupovina;
    }

    public void dodajZaposlenog (Osoba o){// dodavanje zaposlenog
        nizZaposlenih.add(o);
    }

    public void ukloniZaposlenog (Osoba o){// odpustanje zaposlenog
        nizZaposlenih.remove(o);
    }

    public void dodajProizvod (ProizvodNaStajanju p) {
        boolean postoji = nizProizvodaNaStajanju.contains(p);
        if (postoji){ // ili direktno upisati nizProizvodaNaStajanju.contains(p);
            for (ProizvodNaStajanju pns : nizProizvodaNaStajanju){
                if (p.equals(pns)){
                    int novaKolicina = pns.getKolicinaNaStajanju() + p.getKolicinaNaStajanju();
                    pns.setKolicinaNaStajanju(novaKolicina);
                }
            }
        }
        else {
            nizProizvodaNaStajanju.add(p);
        }
    }

    public Racun kupovina(Osoba kupac, ArrayList<Proizvod> listaZelja){
        Racun r = new Racun(listaZelja, "27.12.2021", kupac, nizZaposlenih.get(0));

        for (Proizvod p : listaZelja){
            for (ProizvodNaStajanju pns : nizProizvodaNaStajanju){
                if (p.equals(pns.getProizvod())){
                    int novaKolicina = pns.getKolicinaNaStajanju() - 1;
                    pns.setKolicinaNaStajanju(novaKolicina);
                    break;
                }
            }
        }

        nizObavljenihKupovina.add(r);
        return r;
    }


}
