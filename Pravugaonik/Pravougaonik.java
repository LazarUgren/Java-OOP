package Video18Klase.Pravugaonik;

public class Pravougaonik {
    private  double duzina;
    private  double sirina;

    public Pravougaonik(double duzina, double sirina) {
        this.duzina = duzina;
        this.sirina = sirina;
    }
    public double getDuzina() {
        return duzina;
    }
    public double getSirina() {
        return sirina;
    }
    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }
    public void setSirina(double sirina) {
        this.sirina = sirina;
    }
    //metoda koja racuna povrsinu ovog pravugaonika, i vraca vrednost koju izracuna
    public double obim (){
        double o = 2 * duzina + 2 * sirina;
        return o;
    }
    //metoda koja racuna povrsinu ovog pravugaonika, i koja vraca vrednost koju izracuna
    public  double povrsina(){
        double p = duzina * sirina;
        return p;
    }
    /*
    public String toString(){
        /*
        String vraceniString;
        vraceniString = "Duzina pravugaonika je: " + duzina + "\n";
        vraceniString += "Sirina pravugaonika je: " + sirina + "\n";
        vraceniString += "Obim pravugaonika je: " + obim() + "\n";
        vraceniString += "Povrsina pravugaonika je: " + povrsina() + "\n";
        return vraceniString;


        StringBuilder sb = new StringBuilder();
        sb.append("Duzina pravugaonika je: " + duzina + "\n");
        sb.append("Sirina pravugaonika je: " + sirina + "\n");
        sb.append("Obim pravougaonika je: " + obim() + "\n");
        sb.append("povrsina pravugaonika je: " + povrsina() + "\n");
        return sb.toString();
    }
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Duzina pravugaonika je: ");
        sb.append(duzina);
        sb.append("\n");

        sb.append("Sirina pravugaonika je: ");
        sb.append(sirina);
        sb.append("\n");

        sb.append("Obim pravugaonika je: ");
        sb.append(obim());
        sb.append("\n");

        sb.append("Povrsina pravugaonika je: ");
        sb.append(povrsina());
        sb.append("\n");
        return sb.toString();
    }


}
