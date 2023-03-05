package Video25VezbanjeZaTest.Transakcije;
/*
Napisati klasu Datum koja ima sledece atribute:
dan (int)
mesec (int)
godina (int)

Napisati:
-Konstruktor
-getter i setter
-toString, format:
    -dan-mesec-godina
-privatnu staticku metodu proveriDatum koja proverava da li je
datum validan ako:
    -mesec je od 1-12
    -godina je veca od 2000
    -dan je:
        -u mesecima: 1, 3, 5, 7, 8, 10, 12 izmedju 1-31
        -u mesecima: 4, 6, 9, 11 izmedju 1-30
        -u mesecu 2 je izmedju 1-28, odnosno 1-29 ako je godina prestupna

-Ovu metodu pozvati u konstruktoru i setterima. U slucaju nevalidnosti:
    -ispisati poruku o gresci ili
    -baciti AritmeticException (+ 5 poena)
    ______________________________________________

Napisati klasu Racun koja ima sledece atribute:
    -stanje (double)
    -dozvoljeni minus (double)

Napisati:
    -Konstruktor
    -gettere i settere (stanje moze samo da se dohvati, ne moze da se postavi)
    -metodu uplati koja prima sumu koja se uplacuje na racun
    -metodu skini, koja prima sumu koja se skida sa racuna, novac se skida samo ako skidanjem te sume ne prelazimo dozvoljeni minus.
     Metoda vraca boolean (true ako je novac skinut, false ako nije jer nema dovoljno novca)

     ______________________________________

 Napisati apstraktnu klasu ZahtevZaTransver koja ima sledece atribute:
    - id - jednoznacan automatski generisan celobroja identifikator
    - racun primaoca
    - racun uplatioca
    - datum podnosenja zahteva
    - iznos

 Napisati:
    - Konstruktor
    - gettere i settere (sve moze da se dohvati, samo iznos i datum mogu da se postave)
    - apstraktnu metodu izvrsiZahtev, metoda vraca boolean

    ________________________________________________

Napisati klasu Uplatnica. Uplatnica je zahtevZaTransver koja ima sledece atribute:
    - svrha uplate (String)

Napisati:
    - Kontruktor
    - gettere i settere
    - toString, format je:
        uplatnica(<id>) <datum> [<iznos> : <provizija>] Svrha : <svrha>
        npr:
        uplatnica (2) 21.12.2021 [1000.54 : 10.0054] Svrha: Racun za struju

    - Nadjacati metodu izvrsiZahtev, ova metoda skida <iznos> i proviziju koja iznosi 1%
      od <iznos>-a sa racuna uplatioca ako je to moguce (ako uplatilac ima dovoljno sredstava),
      i uplacuje <iznos> (ne i proviziju!) na racun primioca. Metoda vraca true ako je zahtev izvrsen, false ako nije.



   ___________________________________________________________

   Napisati klasu KreditniZahtev. KreditniZahtev je ZahtevZaTransver koja ima sledece dodatne atribute:
        - datumPocekaOtplate
        - datumKrajaOtplate

   Napisati:
        - konstruktor
        - gettere i settere
        - toString, format je:
            kredit (<id>) <datum> [<iznos>] Pocetak otplate: <datumPocetkaOtplate> Kraj otplate <datumKrajaOtplate>
            npr
            kredit (3) 11.11.2011 [1000.54] Pocetak otplate: 21.12.2012 Kraj otplate: 12.12.2013
        - Nadjacati metodu izvrsiZahtev, ova metoda skida <iznos> sa racuna uplatioca ako je to moguce (ako uplatilac ima dovoljno sredstava), i uplacuje <iznos>
          umanjen za kamatu koja iznosi 5% na racun primaoca. Metoda vraca true ako je zahtev izvrsen, false ako nije.

          ___________________________________________

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

   __________________________________

 Napisati test program (main metodu), u kojoj je potrebno
    - napraviti nekoliko datuma
    - napraviti banku (ukljucujuci i racun za banku)
    - napraviti jos dva racuna
    - napraviti nekoliko zahteva za transfer (kredita i uplatnica), dodati ih u banku i izvrsiti nekoliko
    - ispisati sve racune
    - ispisati banku


 */
public class Datum {
    private int dan;
    private int mesec;
    private int godina;

    public Datum(int dan, int mesec, int godina) throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);

        if (dobarDatum == false){
            //System.out.println("Datum nije dobar");
            ArithmeticException greska = new ArithmeticException("Datum nije dobar");
            throw greska;
        }

        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan)throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);

        if (dobarDatum == false){
            //System.out.println("Datum nije dobar");
            ArithmeticException greska = new ArithmeticException("Datum nije dobar");
            throw greska;
        }
        this.dan = dan;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec)throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);

        if (dobarDatum == false){
            //System.out.println("Datum nije dobar");
            ArithmeticException greska = new ArithmeticException("Datum nije dobar");
            throw greska;
        }
        this.mesec = mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina)throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);

        if (dobarDatum == false){
            //System.out.println("Datum nije dobar");
            ArithmeticException greska = new ArithmeticException("Datum nije dobar");
            throw greska;
        }
        this.godina = godina;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(dan).append("-").append(mesec).append("-").append(godina);

        return sb.toString();
    }

    private static boolean proveriDatum(int dan, int mesec, int godina){// Ova metoda buduci da je staticka ne moze pristupiti
                                            //nestatickim poljima klase Datum (dan, mesec, godina), ona moze pristupiti samo statickim poljima.
                                            // ona jedino moze doci do nestatickih polja ako ih ubacimo kao argumente.

        // Ovo je pretpostavka da je datum dobar, pa onda nakon toga nadole idemo da proverimo da li jeste dobar.
        // Ovo je linearni pravac i on vraca onda poslednju ubelezenu vrednost, zato je i static!
        boolean dobarDatum = true;

        if (godina < 2000){
            dobarDatum = false;
        }

        switch (mesec){
            case 1, 3, 5, 7, 8, 10, 12:
                if (dan < 1 || dan > 31){
                    dobarDatum = false;
                }
                break;
            case 4, 6, 9, 11:
                if (dan < 1 || dan > 30){
                    dobarDatum = false;
                }
                break;
            case 2:
                if (godina % 4 == 0){
                    if (dan < 1 || dan > 29){
                        dobarDatum = false;
                    }
                }else {
                    if (dan < 1 || dan > 28){
                        dobarDatum = false;
                    }
                }
                break;
            default:
                dobarDatum = false;
        }

        return dobarDatum;
    }
}
