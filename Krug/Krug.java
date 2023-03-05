package Video18Klase.Krug;

public class Krug {
    private double poluprecnik;

    public Krug(double poluprecnik) {
        if (poluprecnik < 0) {
            System.out.println("Greska! Uneli ste negativnu vrednost.");
        } else {
            this.poluprecnik = poluprecnik;
        }

    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        if (poluprecnik < 0) {
            System.out.println("Greska! Uneli ste negativan poluprecnik");
        } else {
            this.poluprecnik = poluprecnik;
        }
    }

    public double povrsina() {
        return Math.PI * Math.pow(poluprecnik, 2);
    }

    public double obim() {
        return Math.PI * poluprecnik * 2;
    }
    /*
    public String toString(){
        /*
        String vraceniString;
        vraceniString = "Poluprecnik kruga je: " + poluprecnik + "\n";
        vraceniString += "Obim kruga je: " + obim() + "\n";
        vraceniString += "Povrsina kruga je: " + povrsina() + "\n";
        return vraceniString;


        StringBuilder sb = new StringBuilder();
        sb.append("Poluprecnik kruga je: " + poluprecnik + "\n");
        sb.append("Obim kruga je: " + obim() + "\n");
        sb.append("Povrsina kruga je: " + povrsina() + "\n");
        return sb.toString();
    }
    */

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poluprecnik kruga je: ");
        sb.append(poluprecnik);
        sb.append("\n");

        sb.append("Obim kruga je: ");
        sb.append(obim());
        sb.append("\n");

        sb.append("Povrsina kruga je: ");
        sb.append(povrsina());
        sb.append("\n");
        return sb.toString();
    }


}
