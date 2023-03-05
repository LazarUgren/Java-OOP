package Video23ApstrakneKlase_Polimorfizam_Git.PrevoznoSredstvo;

import java.util.ArrayList;

public class TestPrevoznoSredstvo {
    public static void main(String[] args) {
        // nominalni tip PrevoznoSredstvo, stvarni tip Automobil
        Automobil a1 = new Automobil(2017, "Nemacka", "BMW", "Dizel", 2.0);
        // nominalni tip PrevoznoSredstvo, stvarni tip Autobus
        Autobus b1 = new Autobus(2017, "Nemacka", "BMW", 70);
        // nominalni tip PrevoznoSredstvo, stvarni tip Voz
        Voz v1 = new Voz(2017, "Francuska", "TZV", 10);

        // kako je nominalni tip a1 PrevoznoSredstvo mogu da pozivam samo metode koje postoje u prevoznom sredstvu
        // medjutim ako ta metoda postoji nadjacana u stvarnom tipu onda ce se pozvati ona
        a1.sirena();
        b1.sirena();
        v1.sirena();

        // sta je prava moc polimorfizma
        /*
        prava moc polimorfizma lezi u tome sto mozes kroz petlju da provrtis sve podredjene konkretne klase tj.
        objekte. I ako nadjacas metodu glavne klase tj. zamenis je metodom podredjene klase.
        Onda mozes kroz petlju da izvrtis sve metode! E to je prava stvar!
         */
        ArrayList<PrevoznoSredstvo> prevoznaSredstva = new ArrayList<PrevoznoSredstvo>();
        prevoznaSredstva.add(a1);
        prevoznaSredstva.add(b1);
        prevoznaSredstva.add(v1);

        for (PrevoznoSredstvo ps : prevoznaSredstva){
            ps.sirena();
        }

    }
}
