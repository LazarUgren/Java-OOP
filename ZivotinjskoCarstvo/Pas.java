package Video22Nasledjivanje.ZivotinjskoCarstvo;

public class Pas extends Zivotinja{
    private String rasa;

    public Pas(String ime, int godine, String rasa) {
        super(ime, godine);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void zvuk(){
        //super.zvuk(); //ovo pisem u slucaju da pozivam telo funkcije iz klase iz koje izvodim ovu funkciju.
        System.out.println("av av av av");
    }
}
