package Video25VezbanjeZaTest.Transakcije;
/*
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

 */
public class Uplatnica extends  ZahtevZaTransfer{
    private String svrhaUplate;

    public Uplatnica(Racun primaoc, Racun uplatioc, Datum datum, double iznos, String svrhaUplate) {
        super(primaoc, uplatioc, datum, iznos);
        this.svrhaUplate = svrhaUplate;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("uplatnica (");
        sb.append(id);
        sb.append(")");

        sb.append(datum.toString());

        sb.append("[");
        sb.append(iznos);
        sb.append(" : ");
        sb.append(iznos / 100);
        sb.append("]");

        sb.append(" Svrha: ");
        sb.append(svrhaUplate);

        return sb.toString();
    }


    public boolean izvrsiZahtev() {
        double provizija = iznos / 100;
        double iznosIProvizija = iznos + provizija;
        boolean skinuto = uplatioc.skini(iznosIProvizija);

        if (skinuto){
            primaoc.uplati(iznos);
            return true;
        } else {
            return false;
        }
    }
}
