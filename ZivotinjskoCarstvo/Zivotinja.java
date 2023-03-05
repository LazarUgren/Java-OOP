package Video22Nasledjivanje.ZivotinjskoCarstvo;
/*
Apstrakna klasa je klasa koja ima barem jednu apstraktnu metodu.
Apstrakna metoda je metroda koja nema definiciju ( telo ).
Nije moguce kreirati objekte apstraktne klase!!!
Apstraktne klase sluze da se koriste u nasledjivanju, kada klase imaju neke
zajednicke atribute, ali ti atributi sami po sebi ne mogu da cine neki
konkretan objekat.
 */

public abstract class Zivotinja {
    protected String ime;
    protected int godine;

    public Zivotinja(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public abstract void zvuk();//OVo je apstraktna funkcija
    //apstrakna funkcija je ona koja nema telo funkcije, a telo funkcije se nalazi
    //izmedju viticastih zagrada kojih ocigledno nema!

}
