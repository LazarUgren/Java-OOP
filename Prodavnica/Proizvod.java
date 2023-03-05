package Video21ZnacenjeStatic_VezbanjeZadataka.Prodavnica;
/*
Naziv proizvoda (String)
Cena proizvoda (double)
Opis proizvoda (String)
Tezina proizvoda u gramima (int)
Proizvod ne mora imati opis. Napisati konstruktor(e), gettere, settere, toString
format za toString:
Naziv proizvoda: naziv
Cena proizvoda: cena
Opis proizvoda: opis (String)
Tezina proizvoda: tezina g
 */
public class Proizvod {
    private String nazivProizvoda;
    private double cenaProizvoda;
    private String opisProizvoda;
    private int tezinaProizvodaUGramima;

    public Proizvod(String nazivProizvoda, double cenaProizvoda, String opisProizvoda, int tezinaProizvodaUGramima) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.opisProizvoda = opisProizvoda;
        this.tezinaProizvodaUGramima = tezinaProizvodaUGramima;
    }

    public Proizvod(String nazivProizvoda, double cenaProizvoda, int tezinaProizvodaUGramima) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.tezinaProizvodaUGramima = tezinaProizvodaUGramima;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public double getCenaProizvoda() {
        return cenaProizvoda;
    }

    public String getOpisProizvoda() {
        return opisProizvoda;
    }

    public int getTezinaProizvodaUGramima() {
        return tezinaProizvodaUGramima;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public void setCenaProizvoda(double cenaProizvoda) {
        this.cenaProizvoda = cenaProizvoda;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }

    public void setTezinaProizvodaUGramima(int tezinaProizvodaUGramima) {
        this.tezinaProizvodaUGramima = tezinaProizvodaUGramima;
    }


    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ");
        sb.append(nazivProizvoda);
        sb.append("\n");

        sb.append("Cena proizvoda: ");
        sb.append(cenaProizvoda);
        sb.append("\n");

        sb.append("Opis proizvoda: ");
        if (opisProizvoda == null){
            sb.append("Nema opisa");
        } else {
            sb.append(opisProizvoda);
        }
        sb.append("\n");

        sb.append("Tezina proizvoda: ");
        sb.append(tezinaProizvodaUGramima);
        sb.append(" grama. \n");

        return sb.toString();
    }
}
