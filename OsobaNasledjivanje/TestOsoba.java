package Video22Nasledjivanje;

public class TestOsoba {
    public static void main(String[] args) {
        Djak dj = new Djak("Lazar", "Ugrenovic", 1994, 4);
        dj.getIme();
        dj.getPrezime();
        dj.getPrezime();
        dj.getRazred();

        Profesor p = new Profesor("Ksenija", "Kostic", 1993, "Java");
        p.getIme();
        p.getPrezime();
        p.getGodiste();
        p.getPredmetKojiPredaje();
    }
}
