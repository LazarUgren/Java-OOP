package Video22Nasledjivanje.ZivotinjskoCarstvo;

public class Macka extends Zivotinja{
    private String boja;

    public Macka(String ime, int godine, String boja) {
        super(ime, godine);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void zvuk(){
        System.out.println("mnjau mnjau mnjau");
    }


}
