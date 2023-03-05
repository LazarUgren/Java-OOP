package Video24_5Dopunska.Vezbanje;

public abstract class Pesma {
    private String zanr;
    private String ime;
    private int duzinaTrajanja;

    public Pesma(String zanr, String ime, int duzinaTrajanja) {
        this.zanr = zanr;
        this.ime = ime;
        this.duzinaTrajanja = duzinaTrajanja;
    }

    public abstract String zvuk();

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getDuzinaTrajanja() {
        return duzinaTrajanja;
    }

    public void setDuzinaTrajanja(int duzinaTrajanja) {
        this.duzinaTrajanja = duzinaTrajanja;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime). append(" - ").append(duzinaTrajanja).append("\n");
        sb.append(zanr);
        return sb.toString();
    }

}

