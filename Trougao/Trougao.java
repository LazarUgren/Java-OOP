package Video19toStringStringBuilder.Trougao;
/*
Zadatak trougao:
Klasa trougao ima 3 polja koji predstavljaju stranice:stranicaA, stranicaB i stranicaC.
Vrednost stranica je tipa double. Napisati konstruktor, getter i setter metode za sve
stranice i metode za racunanje obima i povrsine.
 */

public class Trougao {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    private boolean daLiJeTrougaoValidan(){
        //vrati true ako jeste
        //vrati false ako nije
        //Troguao nije validan ako zbir duzina bilo koje 2 stranice je manji od trece stranice

        if (stranicaA <= 0 || stranicaB <= 0 || stranicaC <= 0){
            return false;
        } else if (stranicaA + stranicaB < stranicaC){
            return false;
        } else if (stranicaB + stranicaC < stranicaA) {
            return false;
        } else if (stranicaC + stranicaA < stranicaB) {
            return false;
        } else {
            return true;
        }
    }

    public Trougao(double stranicaA, double stranicaB, double stranicaC){
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if (validan == false){
            System.out.println("Pokusavate kreirati nevalidan trougao");
        }

    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
        boolean validan = daLiJeTrougaoValidan();
        if (validan == false){
            System.out.println("Vase menjanje straniceA je ucinilo ovaj trougao nevalidnim");
        }
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
        boolean validan = daLiJeTrougaoValidan();
        if (validan == false){
            System.out.println("Vase menjanje straniceB je ucinilo ovaj trougao nevalidnim");
        }
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if (validan == false){
            System.out.println("Vase menjanje straniceC je ucinilo ovaj trougao nevalidnim");
        }
    }
    public double obim (){
        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    public double povrsina () {
        /*
        Povrsinu cu izracunati po Heronovom obrascu (bez antickih grka nema nista/ovo se uci u osnovnoj skoli)
        s = (a+b+c)/2 drugim recima ovo je polovina obima
        formula:
        p = (sve je stavljeno pod koren sto sledi) s(s-a)(s-b)(s-c)
         */
        //prvi nacin
        //double s = (stranicaA + stranicaB + stranicaC) / 2;
        //drugi nacin preko poziva metode obim()
        double s = obim() / 2;
        double podKorenaVrednost = s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC);
        //double p = Math.sqrt(podKorenaVrednost); // Math.sqrt() je funkcija izvlacenja korena iz vrednosti koju prosledimo u zagradu.
        double p = Math.sqrt(s) * Math.sqrt(s - stranicaA) * Math.sqrt(s - stranicaB) * Math.sqrt(s - stranicaC);
        return p;
    }
    /*
    public String toString() {

        Ovaj nacin (koristeci String klasu) nije efikasan, ukljucuje mnogo kopiranja u memoriji.
        Mislim da se ovde radi kao u sumi int-a, samo sto se sabiraju stringovi
        s = s + 1; i onda vrti ovo... dodaj na string novi tekst.

        String vraceniString;
        vraceniString = "Duzina stranice A je: " + stranicaA + "\n";
        vraceniString += "Duzina stranice B je: " + stranicaB + "\n";
        vraceniString += "Duzina stranice C je: " + stranicaC + "\n";
        return vraceniString;
    }

        Ovaj nacin je mnogo bolji i efikasniji jer ne ukljucuje nikakvo kopiranje u memoriji.
        On funkcionise na taj nacin sto postojecem stringu dodajemo novi tekst,
        tehnicki mi ne sabiramo vise stringova kao predhodnom primeru, no
        radimo samo na jednom tj. nadogradjujemo ga sadrzajno.

        StringBuilder sb = new StringBuilder();
        sb.append("Duzina stranice A je: " + stranicaA + "\n");
        sb.append("Duzina stranice B je: " + stranicaB + "\n");
        sb.append("Duzina stranice C je: " + stranicaC + "\n");
        String a = sb.toString();
        return a;
    }
         */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Duzina stranice A je: ");
        sb.append(stranicaA);
        sb.append("\n");

        sb.append("Duzina stranice B je: ");
        sb.append(stranicaB);
        sb.append("\n");

        sb.append("Duzina stranice C je: ");
        sb.append(stranicaC);
        sb.append("\n");
        return sb.toString();
    }

}
