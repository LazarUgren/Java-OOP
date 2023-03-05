package Video21ZnacenjeStatic_VezbanjeZadataka.Putovanje;

public class Grad { // Grad pocinje velikim slovom zato sto je to klasa koju pravimo
    private String ime;
    private int brojStanovnika;
    private String drzava;

    public Grad(String ime, int brojStanovnika, String drzava) {
        this.ime = ime;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }

    public String getIme() {
        return ime;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        if (brojStanovnika < 0){
            System.out.println("Uneli ste negativan broj, pokusajte ponovo");
        } else {
            this.brojStanovnika = brojStanovnika;
        }
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Broj stanovnika: ");
        sb.append(brojStanovnika);
        sb.append("\n");

        sb.append("Drzava: ");
        sb.append(drzava);
        sb.append("\n");

        return sb.toString();
    }

}
