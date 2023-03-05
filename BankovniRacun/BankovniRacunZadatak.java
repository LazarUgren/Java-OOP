package Video19toStringStringBuilder.BankovniRacun;

import Video18Klase.Osoba.Osoba;

public class BankovniRacunZadatak {

    private Osoba vlasnikRacuna;
    private double stanjeNaRacunu;

    public BankovniRacunZadatak(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
        this.stanjeNaRacunu = 0;
    }

    public BankovniRacunZadatak(Osoba vlasnikRacuna, double stanjeNaRacunu) {
        this.vlasnikRacuna = vlasnikRacuna;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public Osoba getVlasnikRacuna() {
        return vlasnikRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setVlasnikRacuna(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    public void uplata (double iznos){
        stanjeNaRacunu = stanjeNaRacunu + iznos;
    }
    public void isplata (double iznos){
        if (iznos > stanjeNaRacunu){
            System.out.println("Greska! Uneli ste iznos koji premasuje vase stanje na racunu.");
        }
        else {
            stanjeNaRacunu = stanjeNaRacunu - iznos;
        }

    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (vlasnikRacuna != null){
            sb.append("Vlasnik racuna je: ");
            sb.append(vlasnikRacuna.getIme());
            sb.append(" ");
            sb.append(vlasnikRacuna.getPrezime());
            sb.append("\n");
        }
        else {
            sb.append("Racun nema vlasnika");
        }

        sb.append("Stanje na racunu je: ");
        sb.append(stanjeNaRacunu);
        sb.append("\n");

       return sb.toString();
    }
}
