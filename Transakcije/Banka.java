package Video25VezbanjeZaTest.Transakcije;
/*
Napisati klasu Banka koja ima sledece atribute:
    naziv banke (String)
    racun (Racun)
    nizZahteva (ArrayList)

Napisati:
    - konstruktor (nizZahteva je inicijalno prazan, ne treba ga slati)
    - gettere i settere (nizZahteva je moguce samo dohvatiti)
    - toString metodu, format:
        <nazivBanke>
        Lista zahteva na cekanju:
            <zahtev>
            <zahtev>
            ...

        npr:

        Komercijalna banka
        Lista zahteva na cekanju:
            uplatnica (2) 21.12.2021 [1000.54 : 10.0054] Svrha: Racun za struju
            kredit (3) 11.11.2011 [1000.54] Pocetak otplate: 21.12.2012 Kraj otplate: 21.12.2013

     - metodu za dodavanje zahteva u niz
     - metodu koja izvrsava prvi zahtev u nizu, i uklanja ga iz niza. Ukoliko nije moguce izvrsiti zahtev ispisati taj zahtev na konzolu i poruku da nije
       mogao biti izvrsen.

 */
import java.util.ArrayList;

public class Banka {
    private String nazivBanke;
    private Racun racun;
    private ArrayList<ZahtevZaTransfer> nizZahteva;

    public Banka(String nazivBanke, Racun racun) {
        this.nazivBanke = nazivBanke;
        this.racun = racun;
        this.nizZahteva = new ArrayList<ZahtevZaTransfer>();
    }

    public String getNazivBanke() {
        return nazivBanke;
    }

    public Racun getRacun() {
        return racun;
    }

    public ArrayList<ZahtevZaTransfer> getNizZahteva() {
        return nizZahteva;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv banke: ");
        sb.append(nazivBanke);
        sb.append("\n");

        sb.append("Lista zahteva na cekanju:\n");

        for (ZahtevZaTransfer zt : nizZahteva){
            sb.append(zt.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void dodajZahtev(ZahtevZaTransfer zt){
        nizZahteva.add(zt);
    }

    public void izvrsiZahtev(){
        // dohvatam prvi zahtev
        ZahtevZaTransfer zt = nizZahteva.get(0);

        // izbacujem iz niza
        nizZahteva.remove(0);

        boolean izvrsen = zt.izvrsiZahtev();

        if (izvrsen == false){
            System.out.println("Nije moguce izvrsiti zahtev: ");
            System.out.println(zt);
        }
    }
}
