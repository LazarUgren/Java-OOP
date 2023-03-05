package Video18Klase.Krug;

import java.util.Scanner;

public class TestKrug {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite poluprecnik kruga: ");
        double poluprecnik = sc.nextDouble();

        Krug K = new Krug(poluprecnik);
        /*
        System.out.println("Povrsina kruga je: " + K.povrsina());
        System.out.println("Obim kruga je: " + K.obim());
        //System.out.println("Poluprecnik kruga je: " + K.getPoluprecnik() + "\n");

        System.out.println("Unesite novi poluprecnik kruga: ");
        double noviPoluprecnik = sc.nextDouble();
        K.setPoluprecnik(noviPoluprecnik);
        System.out.println("\n");

         */

        Krug A = new Krug(10);
        System.out.println(A);
    }
}
