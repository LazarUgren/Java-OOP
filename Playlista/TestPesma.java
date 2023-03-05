package Video24_5Dopunska.Vezbanje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestPesma {
/*
    public static void ispisiElementeListe(List<Integer> lista){
        for (Integer i : lista){
            System.out.println(i);
        }
    }

 */




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pesma enterSandman = new RockPesma("Enter sandman", 180);
        Pesma thriller = new PopPesma("Thriller", 255);


        System.out.println(enterSandman.getZanr());
        System.out.println(enterSandman.zvuk());
        System.out.println("...........");
        System.out.println(enterSandman.toString());

        System.out.println("?????????????");

        System.out.println(thriller.getZanr());
        System.out.println(thriller.zvuk());
        System.out.println(".........");
        System.out.println(thriller.toString());

        System.out.println(",,,,,,,,");
        System.out.println(enterSandman);
        System.out.println(".........");
        System.out.println(thriller);
        System.out.println("Idemo na plajlistu nadalje");

        ArrayList<Pesma> p = new ArrayList<>();
        p.add(enterSandman);
        p.add(thriller);
        Playlista mojaPlayLista = new Playlista("Moja plej lista", p);
        //mojaPlayLista.izbaciPesmu(3);
        try{
            mojaPlayLista.izbaciPesmu(3);
            mojaPlayLista.vrtiUKrugPesme(sc, mojaPlayLista.getPesme());
        } catch (Exception e){
            System.out.println("Nemoguce je izbaciti 3. pesmu iz plejliste duzine: " + mojaPlayLista.getPesme().size());
        }




        /*
        ArrayList<Integer> w = new ArrayList<>();// ovde bi direktno islo LinkedList
        w.add(1);                               // medjutim, posto je gore trazi bilo koju listu
        w.add(2);                               // ovde mozemo da stavimo i ovu drugu
        ispisiElementeListe(w);                   // ideja je logicna, nadredjeni i podredjeni pojam
                                                // ako se gore trazi covek, ovde dole moze biti
                                               // i muska i zenska osoba

         */
        /*
        List<Integer> list = new ArrayList<>();
        Ovako je najpravilnije otkucati, sa leve strane je najopstije,
        dok je sa deste specificno i java programski jezik to omogucava.
        Sa druge strane leva strana moze biti jednaka, ali to nije efikasno.
        Dakle, na levoj strani najopstije, a na destoj specificno.
        Zasto? Na levoj je klasa apstraktna a na desnoj objekat klase koju pravimo.
        Odnosno, na levoj je opsta lista, dok je na desnoj specificna vrsta liste.
         */
    }
}
