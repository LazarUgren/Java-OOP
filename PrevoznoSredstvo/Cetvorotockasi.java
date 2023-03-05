package Video23ApstrakneKlase_Polimorfizam_Git.PrevoznoSredstvo;

public abstract class Cetvorotockasi extends PrevoznoSredstvo{

    public Cetvorotockasi(int godinaProizvodnje, String zemljaProizvodnje, String marka) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
    }
    public void sirena(){

    }

    /*
    Sto se strukture pojmova tice mozemo napraviti klasu
    Prevozno sredstvo koja je iznad klase Cetvortockasi.
    Za nase potrebe svaki cetvorotockas je neko prevczno sredstvo
    Medjutim, bitno, takodje, cetvorotockas je abstraktna klasa koja
    proizilazi iz apstraktne klase.
    Ona moze naslediti apstraktnu metodu iz njoj nadredjenoj apstraktnoj klasi.
    I tako lancamo na dole pojmove dok ne dodjemo do konkretnih:
    npr auto, autobus, voz i tako dalje.
     */
}
