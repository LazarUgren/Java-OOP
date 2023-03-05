package Video21ZnacenjeStatic_VezbanjeZadataka.Prodavnica;
/*
Klasa ProizvodNaStanju koja poseduje sledece atribute:
proizvod (Proizvod)
kolicina na stajanju (int)
Napisati konstruktor(e), gettere, settere, toString.
Format za toString:
Naziv proizvoda: <naziv>
Kolicina na stajanju: kolicina
 */
public class ProizvodNaStajanju {
    private Proizvod proizvod;
    private int kolicinaNaStajanju;

    public ProizvodNaStajanju(Proizvod proizvod, int kolicinaNaStajanju) {
        this.proizvod = proizvod;
        this.kolicinaNaStajanju = kolicinaNaStajanju;
    }

    public ProizvodNaStajanju(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public int getKolicinaNaStajanju() {
        return kolicinaNaStajanju;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public void setKolicinaNaStajanju(int kolicinaNaStajanju) {
        this.kolicinaNaStajanju = kolicinaNaStajanju;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ");
        sb.append(proizvod.getNazivProizvoda());
        sb.append("\n");

        sb.append("Kolicina na stajanju: ");
        sb.append(kolicinaNaStajanju);
        sb.append("\n");

        return sb.toString();
    }
}
