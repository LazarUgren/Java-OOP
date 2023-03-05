package Video18Klase.Osoba;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba profesor = new Osoba("Zoran", "Milicevic", 1996, 189.2);
        System.out.println(profesor.getIme());
        System.out.println(profesor.getPrezime());
        System.out.println(profesor.getGodinaRodjenja());
        System.out.println(profesor.getVisina());

        Osoba asistent = new Osoba("Strahinja", "Trninic", 1997, 198.8 );
        System.out.println(asistent.getIme());
        System.out.println(asistent.getPrezime());
        System.out.println(asistent.getGodinaRodjenja());
        System.out.println(asistent.getVisina() + "\n");

        System.out.println(profesor);
        System.out.println(asistent);

    }
}
