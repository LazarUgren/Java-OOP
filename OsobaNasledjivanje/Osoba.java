package Video22Nasledjivanje;
/*
Za dodatne detalje, ne budi lenj, pogledaj prezentaciju.
Imas je u 8 klase - Uvod!
u principu, iz klase koje smo radili ranije na casovima
klasa Osoba, iz nje smo pravili klase osobe1, profesora, asistenta, kupca, prodavca,
vodju puta, putnika i tako dalje i tako dalje.
Osoba je osnovna klasa, a ove navedene klase koje su proizasle iz nje su
IZVEDENE KLASE!
Izvedene klase u sebi sadrze one atribute koje sadrzi Osnovna klasa i
one atribute koje smo upisali prilikom pravljenja izvedene klase.
npr: Za profesora mi je trazeno: ime, prezime, godiste i visina.
Sve je to sadrzano unutar izvorne klase Osoba.
I pored toga sve sto sam stavio unutar izvedene klase od
atributa takodje se sadrzi u njoj.
 */
/*
Opcija protected koja se nalazi u klasi iz koje izvodimo ostale klase omogucava da se pristupi podatcima
iz klase iz koje izvodimo, ali mozemo da pristupamo samo iz klasa koje smo izveli iz te klase.
Dakle, moze se reci da je pristup ogranicen, tj. da pristupamo samo iz klase koja je subordinirana klasi iz koje
izvodimo.
 */
public abstract class Osoba {
    protected String ime;
    protected String prezime;
    protected int godiste;

    public Osoba(String ime, String prezime, int godiste) {
        this.ime = ime;
        this.prezime = prezime;
        this.godiste = godiste;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }
}
