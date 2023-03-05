package Video23ApstrakneKlase_Polimorfizam_Git.PrevoznoSredstvo;

public class Automobil extends PrevoznoSredstvo{
    private String tipMotora;
    private double kubikazaMotora;

    public Automobil(int godinaProizvodnje, String zemljaProizvodnje, String marka, String tipMotora, double kubikazaMotora) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.tipMotora = tipMotora;
        this.kubikazaMotora = kubikazaMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public double getKubikazaMotora() {
        return kubikazaMotora;
    }

    public void setKubikazaMotora(double kubikazaMotora) {
        this.kubikazaMotora = kubikazaMotora;
    }

    public void sirena(){
        System.out.println("pip pip");
    }
}
