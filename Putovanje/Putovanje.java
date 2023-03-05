package Video21ZnacenjeStatic_VezbanjeZadataka.Putovanje;

import Video18Klase.Automobil.Automobil;
import Video18Klase.Osoba.Osoba;

import java.util.ArrayList;

public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> nizPrijavljenihOsoba;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if (udaljenostUKm < 0) {
            System.out.println("Udaljenost u kilometrima ne sme biti manja od nule.");
        } else {
            this.udaljenostUKm = udaljenostUKm;
        }
        this.nizPrijavljenihOsoba = new ArrayList<Osoba>();
    }


    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        if (udaljenostUKm < 0) {
            System.out.println("Udaljenost u kilometrima ne sme biti manja od nule.");
        } else {
            this.udaljenostUKm = udaljenostUKm;
        }
        this.nizPrijavljenihOsoba = new ArrayList<Osoba>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public ArrayList<Osoba> getNizPrijavljenihOsoba() {
        return nizPrijavljenihOsoba;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if (udaljenostUKm < 0) {
            System.out.println("Udaljenost u kilometrima ne sme biti manja od nule.");
        } else {
            this.udaljenostUKm = udaljenostUKm;
        }
    }

    public double vremeDaSeStigne(double brzina) {// Ona vraca podatak vreme, i pritom ne menja niti udaljenost u km niti menja brzinu.
        double vreme = udaljenostUKm / brzina;    // dakle, to je neka vrsta komande, radi se nesto i rezultat se vrati jer nam je potreban.
        return vreme;
    }

    public void prijava(Osoba o) {
        nizPrijavljenihOsoba.add(o);
    }

    public void odjava(Osoba o) {
        nizPrijavljenihOsoba.remove(o);
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija je: ");
        sb.append(destinacija.getIme());
        sb.append(", ");
        sb.append(destinacija.getDrzava());
        sb.append("\n");

        if (vodjaPuta == null){
            sb.append("Putovanje nema vodju puta. \n");
        } else {
            sb.append("Vodja puta je: ");
            sb.append(vodjaPuta.getIme());
            sb.append(" ");
            sb.append(vodjaPuta.getPrezime());
            sb.append("\n");
        }

        sb.append("Putuje se automobilom: ");
        sb.append(vozilo.getMarka());
        sb.append(", ");
        sb.append(vozilo.getGodiste());
        sb.append(", ");
        sb.append(vozilo.getKilometraza());
        sb.append("\n");

        sb.append("Udaljenost do destinacije u kilometrima je: ");
        sb.append(udaljenostUKm);
        sb.append("\n");

        sb.append("Prijavljene osobe: \n");
        if (nizPrijavljenihOsoba.size() == 0){ // drugi nacin(drugi uslov): nizPrijavljenihOsoba.isEmpty() == true
            sb.append("Nema prijavljenih osoba \n");
        } else {
            for (Osoba prijavljenaOsoba : nizPrijavljenihOsoba){
                sb.append(prijavljenaOsoba.getIme());
                sb.append(" ");
                sb.append(prijavljenaOsoba.getPrezime());
                sb.append("\n");
            }
        }

        return sb.toString();
    }


}
