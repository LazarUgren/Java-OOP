package Video19toStringStringBuilder.BankovniRacun;

import Video18Klase.Osoba.Osoba;

import java.util.ArrayList;

public class Banka {
private String ime;
private String ulica;
private Osoba direktor;
private ArrayList <BankovniRacunZadatak> nizBankovnihRacuna;

    public Banka(String ime, String ulica, Osoba direktor) {
        this.ime = ime;
        this.ulica = ulica;
        this.direktor = direktor;
        this.nizBankovnihRacuna = new ArrayList<BankovniRacunZadatak>();
    }

    public Banka(String ime, String ulica, Osoba direktor, ArrayList<BankovniRacunZadatak> nizBankovnihRacuna) {
        this.ime = ime;
        this.ulica = ulica;
        this.direktor = direktor;
        this.nizBankovnihRacuna = nizBankovnihRacuna;
    }

    public String getIme() {
        return ime;
    }

    public String getUlica() {
        return ulica;
    }

    public Osoba getDirektor() {
        return direktor;
    }

    public ArrayList<BankovniRacunZadatak> getNizBankovnihRacuna() {
        return nizBankovnihRacuna;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setDirektor(Osoba direktor) {
        this.direktor = direktor;
    }

    public void setNizBankovnihRacuna(ArrayList<BankovniRacunZadatak> nizBankovnihRacuna) {
        this.nizBankovnihRacuna = nizBankovnihRacuna;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime banke je: ");
        sb.append(ime);
        sb.append("\n");
        sb.append("Banka se nalazi u ulici: ");
        sb.append(ulica);
        sb.append("\n");
        sb.append("Direktor banke je: ");
        sb.append(direktor.getIme());
        sb.append(" ");
        sb.append(direktor.getPrezime());
        sb.append("\n");

        if (nizBankovnihRacuna.isEmpty() == true){
            sb.append("U ovoj banci ne postoji ni jedan racun: \n");
        } else {
            sb.append("U ovoj banci postoje sledeci racuni: \n");
            for (BankovniRacunZadatak racun : nizBankovnihRacuna) {
                sb.append(racun.toString());
                sb.append("\n");
            }
        }
            return sb.toString();

    }

    public void dodajBankovniRacun(BankovniRacunZadatak b){
        nizBankovnihRacuna.add(b);
    }

    public void ukloniBankovniRacun (BankovniRacunZadatak b){
        nizBankovnihRacuna.remove(b);
    }

    public void ukloniBankovniRacun (Osoba o){
        //prva stvar koju treba da uradimo je da pronadjemo bankovni racun ove osobe
        // prolazimo kroz niz bankovnih racuna, za svaki bankovni racun dohvatamo informacije o njegovom vlasniku
        // uporedjujemo da li je vlasnik tog racuna osoba ciji bankovni racun zelimo da uklonimo
        // ako jeste, onda izadjemo iz petlje i uklonimo taj racun.
        // ako nije, idemo dalje na naredni element niza.
        // ako dodjemo do kraja niza i ne nadjemo ni jedan bankovni racun, ciji je vlasnik
        // osoba ciji bankovni racun zelimo da uklonimo
        // to znaci da ta osoba nema bankovni racun u toj banci.
        BankovniRacunZadatak bankovniRacunOveOsobe = null;
        for (BankovniRacunZadatak br : nizBankovnihRacuna){// nesto nije u redu
            Osoba vlasnikOvogRacuna = br.getVlasnikRacuna();
            if (vlasnikOvogRacuna.equals(o));{
                bankovniRacunOveOsobe = br;
                break;
            }
        }

        if (bankovniRacunOveOsobe == null){// ovo ovde se ne izvodi jer je petlja iznad pokvarena
            System.out.println(o.getIme() + " " + o.getPrezime() + " nema bankovni racun u ovoj banci");
        }
        else {
            nizBankovnihRacuna.remove(bankovniRacunOveOsobe);
        }

    }

    public void ukloniBankovniRacun2Nacin (Osoba o){// ovo radi isto sto i ono iznad, ali za razliku od gornjeg ovo radi!
        boolean imaRacun = false;
        for (BankovniRacunZadatak br : nizBankovnihRacuna){
            Osoba vlasnikOvogRacuna = br.getVlasnikRacuna();
            if (vlasnikOvogRacuna.equals(o)){
                nizBankovnihRacuna.remove(br);
                imaRacun = true;
                break;
            }
        }
        if (imaRacun == false){
            System.out.println(o.getIme() + " " + o.getPrezime() + " nema bankovni racun u ovoj banci");
        }
    }



}
