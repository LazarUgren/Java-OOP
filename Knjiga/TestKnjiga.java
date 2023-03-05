package Video20PaketiNIZOVIoBJEKATarrayList.Knjiga;

import Video18Klase.Osoba.Osoba;

public class TestKnjiga {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Zoran", "Milicevic", 1996, 189.2);
        Osoba o2 = new Osoba("Strahinja", "Trninic", 1997, 180);

        Knjiga k1 = new Knjiga("Programiranje u Javi", o1, o2, 200, 2016);
        System.out.println(k1);
        System.out.println(k1.velicinaKnjige());
        Knjiga k2 = new Knjiga("Programiranje u Javi", o1, 200, 2016);
        System.out.println(k2);
        System.out.println(k2.velicinaKnjige());
        Knjiga k3 = new Knjiga("Programiranje u C++", o1, o2, -200, 2016);
        System.out.println(k3);
        System.out.println(k3.velicinaKnjige());
    }
}
