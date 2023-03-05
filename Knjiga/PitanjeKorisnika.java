package Video20PaketiNIZOVIoBJEKATarrayList.Knjiga;

import java.util.Scanner;

public class PitanjeKorisnika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Da li knjiga ima vlasnika: ");
        String odgovor = sc.next();
        if (odgovor.equals("Da")){
            System.out.println("Unesite ime vlasnika:");
        }
        System.out.println("Unesite broj strana: ");
    }
}
