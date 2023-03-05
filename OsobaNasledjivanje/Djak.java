package Video22Nasledjivanje;

public class Djak extends Osoba {
    private int razred;

    public Djak(String ime, String prezime, int godiste, int razred) {
        super(ime, prezime, godiste);
        this.razred = razred;
    }

    public int getRazred() {
        return razred;
    }

    public void setRazred(int razred) {
        this.razred = razred;
    }
}
