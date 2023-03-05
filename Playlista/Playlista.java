package Video24_5Dopunska.Vezbanje;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlista {
    private String ime;
    private ArrayList<Pesma> pesme;
    private int ukupnaDuzinaTrajanja;

    public Playlista(String ime, ArrayList<Pesma> pesme) {
        this.ime = ime;
        this.pesme = pesme;
        this.ukupnaDuzinaTrajanja = 0;
        for (Pesma p : pesme){
            this.ukupnaDuzinaTrajanja += p.getDuzinaTrajanja();
        }
    }

    public Playlista (String ime){
        this.ime = ime;
        this.pesme = new ArrayList<>();
        this.ukupnaDuzinaTrajanja = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Pesma> getPesme() {
        return pesme;
    }

    public void setPesme(ArrayList<Pesma> pesme) {
        this.pesme = pesme;
    }

    public double getUkupnaDuzinaTrajanja() {
        return ukupnaDuzinaTrajanja;
    }

    public void setUkupnaDuzinaTrajanja(int ukupnaDuzinaTrajanja) {
        this.ukupnaDuzinaTrajanja = ukupnaDuzinaTrajanja;
    }
    public  void dodajPesmu(Pesma p){
        pesme.add(p);
        ukupnaDuzinaTrajanja += p.getDuzinaTrajanja();
    }

    public void dodajPesmuNaIndex(int index, Pesma p){
        pesme.add(index, p);
        ukupnaDuzinaTrajanja += p.getDuzinaTrajanja();
    }

    public void izbaciPesmu(Pesma p){
        if (pesme.contains(p)){
            pesme.remove(p);
            ukupnaDuzinaTrajanja -= p.getDuzinaTrajanja();
        }
    }

    public void izbaciPesmu (int index) throws IndexOutOfBoundsException{
            ukupnaDuzinaTrajanja -= pesme.get(index).getDuzinaTrajanja();
            pesme.remove(index);
    }

    /*
    metoda koja vrti pesme u krug
     */

    public void pustiPesmu(int index) throws Exception{
        System.out.println(pesme.get(index).toString());
    }

    public void vrtiUKrugPesme(Scanner sc, ArrayList<Pesma> pesme) throws Exception {
        int brojac = 0;
        while (true){
            System.out.println("Da li da se zaustavim: ");
            int odgovor = sc.nextInt();
            if (odgovor == 1){
                pustiPesmu(brojac);
                brojac++;
                if (brojac == pesme.size()){
                    brojac = 0;
                }
            }else {
                return;
            }
        }

    }

    public void izlistajSvePesmeNekogZanra(String zanr){
        for (Pesma p : pesme){
            if (p.getZanr().equals(zanr)){
                System.out.println(p);
            }
        }
    }

    /*
    Imam dva znara rock i pop, e sada, zelim da napravim metodu koja ce da
    odabere zanr (po mom izboru) i da vrti pesme tog zanra u krug.
     */

    private ArrayList<Pesma> popuni(String zanr){// Ovu metodu koristim kao pomocno sredstvo
        ArrayList<Pesma> t = new ArrayList<>();// metode (vrtiUKrugZanr)
        for (Pesma p : pesme){
            if (p.getZanr().equals(zanr)){
                t.add(p);
            }
        }
        return t;
    }

    public void vrtiUKrugZanr(String zanr) throws Exception {
        ArrayList<Pesma> pomocnaLista = popuni(zanr);
        Scanner sc = new Scanner(System.in);
        vrtiUKrugPesme(sc, pomocnaLista);
    }

}
