package Video23ApstrakneKlase_Polimorfizam_Git.PrevoznoSredstvo;

public class Autobus extends PrevoznoSredstvo{
    private int maksimalanBrojPutnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnje, String marka, int maksimalanBrojPutnika) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public int getMaksimalanBrojPutnika() {
        return maksimalanBrojPutnika;
    }

    public void setMaksimalanBrojPutnika(int maksimalanBrojPutnika) {
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public void sirena(){
        System.out.println("dum dum");
    }
}
