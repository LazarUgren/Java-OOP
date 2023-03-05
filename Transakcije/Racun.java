package Video25VezbanjeZaTest.Transakcije;
/*
Napisati:
    -Konstruktor
    -gettere i settere (stanje moze samo da se dohvati, ne moze da se postavi)
    -metodu uplati koja prima sumu koja se uplacuje na racun
    -metodu skini, koja prima sumu koja se skida sa racuna, novac se skida samo ako skidanjem te sume ne prelazimo dozvoljeni minus.
     Metoda vraca boolean (true ako je novac skinut, false ako nije jer nema dovoljno novca)

 */
public class Racun {
    private double stanje;
    private double dozvoljeniMinus;

    public Racun(double stanje, double dozvoljeniMinus) {
        this.stanje = stanje;
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public double getStanje() {
        return stanje;
    }

    public double getDozvoljeniMinus() {
        return dozvoljeniMinus;
    }

    public void setDozvoljeniMinus(double dozvoljeniMinus) {
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public void uplati (double suma){
        stanje += suma;
    }

    public boolean skini(double suma){
        if (dozvoljeniMinus + stanje > suma){
            stanje = stanje - suma;
            return true;
        } else {
            return false;
        }
    }


}
