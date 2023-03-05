package Video23ApstrakneKlase_Polimorfizam_Git.PrevoznoSredstvo;
/*
Napisati klasu PrevoznoSredstvo sa sledecim atributima:
godinaProizvodnje int
zemljaProizvodnje String
marka String

Napisati klasu Automobil. Automobil je PrevoznoSredstvo koje pored atributa iz PrevoznogSredstva ima i:
tipMotora String
kubikazaMotora int

Napisati klasu Autobus. Autobus je PredvoznoSredstvo koje pored atributa iz PrevoznogSredstva ima i:
maksimalanBrojPutnika int

Napisati klasu Voz. Voz je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
brojVagona int

U svakoj klasi napisati konstruktor, getter, setter metode.
toString ne treba
U svakoj klasi napisati metodu sirena koja ispisuje:
automobil "pip pip"
autobus "dum dum"
voz "cu cu"
prevoznoSredstvo nista (apstraktna klasa/Apstraktna metoda)
 */
public class PrevoznoSredstvo {
    protected int godinaProizvodnje;
    protected String zemljaProizvodnje;
    protected String marka;

    public PrevoznoSredstvo(int godinaProizvodnje, String zemljaProizvodnje, String marka) {
        this.godinaProizvodnje = godinaProizvodnje;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getZemljaProizvodnje() {
        return zemljaProizvodnje;
    }

    public void setZemljaProizvodnje(String zemljaProizvodnje) {
        this.zemljaProizvodnje = zemljaProizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void sirena(){

    }
}
