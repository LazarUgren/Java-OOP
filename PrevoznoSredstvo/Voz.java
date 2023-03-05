package Video23ApstrakneKlase_Polimorfizam_Git.PrevoznoSredstvo;

public class Voz extends PrevoznoSredstvo{
    private int brojVagona;

    public Voz(int godinaProizvodnje, String zemljaProizvodnje, String marka, int brojVagona) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.brojVagona = brojVagona;
    }

    public int getBrojVagona() {
        return brojVagona;
    }

    public void setBrojVagona(int brojVagona) {
        this.brojVagona = brojVagona;
    }
    public void sirena(){
        System.out.println("cu cu");
    }
}
