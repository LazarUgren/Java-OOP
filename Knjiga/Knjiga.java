package Video20PaketiNIZOVIoBJEKATarrayList.Knjiga;
/*
Napisati klasu Knjiga koja ima sledeca polja/atribute:
nazivKnjige(String)
vlasnik(Osoba)
brojStrana(int)
godinaIzdanja(int)

Broj strana i godina izdanja ne mogu biti negativni. Ispisati poruku o gresci kao korisnik pokusa da napravi
knjigu sa negativnim brojem strana ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).
Takodje, ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti negativno.

Napisati sledece metode:
2 Konstruktora. Knjiga ne mora imati vlasnika -> dakle, jedan konstruktor gde se salje i ko je vlasnik, drugi
konstruktor gde se ne salje ko je vlasnik.

getter i setter metode za sva polja

toString koristeci StringBuilder

format:
Naziv knjige je: <naziv knjige>
Autor knjige je: <ime i prezime autora ako postiji, 'nepoznato' ako autor nije postavljen (Null)>
Vlasnik knjige je: < ime i prezime ako vlasnik postoji, 'knjiga nema vlasnika' ako nije potavljen (Null)>

Broj strana: <broj strana>
godina izdanja: <godina izdanja>

Napisati i metodu "velicinaKnjige" koja vraca String
"mala knjiga" - ako je broj strana od 0 do 100
"srednje velika knjiga" - ako je broj strana od 101 do 300
"velika knjiga" - ako je broj strana od 301 do 600
"bas velika knjiga" - ako je broj strana veci od 600

 */

import Video18Klase.Osoba.Osoba;

public class Knjiga {
    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    private void proveriZaNegativno(int brojStrana, int godinaIzdanja) {
        if (brojStrana < 0) {
            System.out.println("Knjiga ne moze imati negativan broj strana");
        } else {
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja < 0) {
            System.out.println("Knjiga ne moze imati negativnu godinu izdanja");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        proveriZaNegativno(brojStrana, godinaIzdanja);

    }
    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        proveriZaNegativno(brojStrana, godinaIzdanja);
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana < 0) {
            System.out.println("Knjiga ne moze imati negativan broj strana");
        } else {
            this.brojStrana = brojStrana;
        }
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja < 0) {
            System.out.println("Knjiga ne moze imati negativnu godinu izdanja");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");


        sb.append("Autor knjige je: ");

        if (autor == null){
            sb.append("Nepoznato");
        } else {
            sb.append(autor.getIme());
            sb.append(" ");
            sb.append(autor.getPrezime());
            sb.append("\n");
        }

        if (vlasnik == null){
            sb.append("Knjiga nema vlasnika");
            sb.append("\n");
        }else {
            sb.append("Vlasnik knjige je: ");
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");
        }

        sb.append("Broj strana je: ");
        sb.append(brojStrana);
        sb.append("\n");

        sb.append("Godina izdanja: ");
        sb.append(godinaIzdanja);
        sb.append("\n");
        return sb.toString();
    }

    public String velicinaKnjige(){
        String velicina;
        if (brojStrana <= 100){
            velicina = "mala knjiga";
        } else if (brojStrana <= 300) {
            velicina = "srednje velika knjiga";
        } else if (brojStrana <= 600) {
            velicina = "velika knjiga";
        } else {
            velicina = "bas velika knjiga";
        }
        return velicina;
    }


}
