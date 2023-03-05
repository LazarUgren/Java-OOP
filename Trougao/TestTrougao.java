package Video19toStringStringBuilder.Trougao;

import java.util.Scanner;

public class TestTrougao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Unesite vrednost za stranicu a trougla: ");
        double stranicaA = sc.nextDouble();
        System.out.print("Unesite vrednost za stranicu b trougla: ");
        double stranicaB = sc.nextDouble();
        System.out.print("Unesite vrednost za stranicu c trougla: ");
        double stranicaC = sc.nextDouble();

         */

        //Trougao t1 = new Trougao(stranicaA, stranicaB, stranicaC);
        Trougao t1 = new Trougao(10,11,12);
        /*
        System.out.println("Povrsina trougla je: " + t1.povrsina());
        System.out.println("Obim trougla je: " + t1.obim());

        System.out.println("Vrednost stranice A trougla je: " + t1.getStranicaA());
        System.out.println("Vrednost stranice B trougla je: " + t1.getStranicaB());
        System.out.println("Vrednost stranice C trougla je: " + t1.getStranicaC());

         */

        System.out.println(t1);


    }
}
