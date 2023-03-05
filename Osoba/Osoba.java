package Video18Klase.Osoba;

public class Osoba {
    //polje (atribut) klase...ovaj deo se ovako zove do sledeceg komentara
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;

    //konstruktor metoda
    //nema povratnu vrednost
    //ime te metode je uvek isto kao ime klase

    public Osoba(String ime1, String prezime1, int godinaRodjenja1, double visina1){
        ime = ime1;
        prezime = prezime1;
        godinaRodjenja = godinaRodjenja1;
        visina = visina1;
    }
    //getter i setter metode
    //getter i setter za ime
    public String getIme (){
        return ime;
    }
    public void setIme(String ime1){
        ime = ime1;
    }
    //getter i setter za prezime
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime1){
        prezime = prezime1;
    }
    //getter i setter za godinu rodjenja
    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja1){
        godinaRodjenja = godinaRodjenja1;
    }
    //getter i setter za visinu
    public double getVisina(){
        return visina;
    }
    public void setVisina (double visina1){
        visina = visina1;
    }
    /*
    public String toString () {
        /*
        String vraceniString;
        vraceniString = "Ime: " + ime + "\n";
        vraceniString += "Prezime: " + prezime + "\n";
        vraceniString += "Godina rodjenja: " + godinaRodjenja + "\n";
        vraceniString += "Visina: " + visina + "\n";
        return vraceniString;

        ................................................
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: " + ime + "\n");
        sb.append("Prezime: " + prezime + "\n");
        sb.append("Godina rodjenja: " + godinaRodjenja + "\n");
        sb.append("Visina: " + visina + "cm" + "\n");
        return sb.toString();
    }
    */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Godina rodjenja: ");
        sb.append(godinaRodjenja);
        sb.append("\n");

        sb.append("Visina: ");
        sb.append(visina);
        sb.append("\n");
        return  sb.toString();
    }
}
