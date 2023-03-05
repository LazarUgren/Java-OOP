package Video25VezbanjeZaTest.Transakcije;
/*
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
 */
public abstract class ZahtevZaTransfer {

    private static int NextId = 1;
    protected int id;
    protected Racun primaoc;
    protected Racun uplatioc;
    protected Datum datum;
    protected double iznos;

    public ZahtevZaTransfer(Racun primaoc, Racun uplatioc, Datum datum, double iznos) {
        this.primaoc = primaoc;
        this.uplatioc = uplatioc;
        this.datum = datum;
        this.iznos = iznos;
        this.id = NextId;
        NextId++;
    }

    public Racun getPrimaoc() {
        return primaoc;
    }

    public Racun getUplatioc() {
        return uplatioc;
    }

    public Datum getDatum() {
        return datum;
    }

    public double getIznos() {
        return iznos;
    }

    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public abstract boolean izvrsiZahtev ();

}
