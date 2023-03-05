package Video25VezbanjeZaTest.Transakcije;
/*
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
 */

public class KreditniZahtev extends ZahtevZaTransfer{
    private Datum datumPocetkaOtplate;
    private Datum datumKrajaOtplate;

    public KreditniZahtev(Racun primaoc, Racun uplatioc, Datum datum, double iznos, Datum datumPocetkaOtplate, Datum datumKrajaOtplate) {
        super(primaoc, uplatioc, datum, iznos);
        this.datumPocetkaOtplate = datumPocetkaOtplate;
        this.datumKrajaOtplate = datumKrajaOtplate;
    }

    public Datum getDatumPocetkaOtplate() {
        return datumPocetkaOtplate;
    }

    public void setDatumPocetkaOtplate(Datum datumPocetkaOtplate) {
        this.datumPocetkaOtplate = datumPocetkaOtplate;
    }

    public Datum getDatumKrajaOtplate() {
        return datumKrajaOtplate;
    }

    public void setDatumKrajaOtplate(Datum datumKrajaOtplate) {
        this.datumKrajaOtplate = datumKrajaOtplate;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("kredit (");
        sb.append(id);
        sb.append(") ");

        sb.append(datum.toString());

        sb.append(" [");
        sb.append(iznos);
        sb.append("] ");

        sb.append("Datum pocetka otplate: ");
        sb.append(datumPocetkaOtplate);
        sb.append(" Datum kraja otplate: ");
        sb.append(datumKrajaOtplate);

        return  sb.toString();
    }

    public boolean izvrsiZahtev(){
        boolean skinuto = uplatioc.skini(iznos);

        if (skinuto){
            double iznosManjeKamata = iznos - 5 * iznos / 100;
            primaoc.uplati(iznosManjeKamata);
            return true;
        } else {
            return false;
        }
    }
}
