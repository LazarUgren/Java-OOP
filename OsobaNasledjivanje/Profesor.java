package Video22Nasledjivanje;
/*
Opcija protected koja se nalazi u klasi iz koje izvodimo ostale klase omogucava da se pristupi podatcima
iz klase iz koje izvodimo, ali mozemo da pristupamo samo iz klasa koje smo izveli iz te klase.
Dakle, moze se reci da je pristup ogranicen, tj. da pristupamo samo iz klase koja je subordinirana klasi iz koje
izvodimo.
 */

public class Profesor extends Osoba {
    private String predmetKojiPredaje;

    public Profesor(String ime, String prezime, int godiste, String predmetKojiPredaje) {
        super(ime, prezime, godiste);
        this.predmetKojiPredaje = predmetKojiPredaje;
    }

    public String getPredmetKojiPredaje() {
        return predmetKojiPredaje;
    }

    public void setPredmetKojiPredaje(String predmetKojiPredaje) {
        this.predmetKojiPredaje = predmetKojiPredaje;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Ime profesora je:");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Godiste profesora je: ");
        //sb.append(godiste); // U ovom redu je primer kako se program buni, zasto? Zasto sto je godiste private, a ne protected.
        //Kada je godiste private, moze mu se prisupiti samo unutar te klase u kojoj je, a izvan nje mora sa getGodiste();
        // Ako stavimo u klasi Osoba da je godiste protected onda mozemo uraditi isto kao sa imenom i prezimenom koji su protected.
        sb.append(super.getGodiste());
        sb.append("\n");

        return sb.toString();
    }
}
