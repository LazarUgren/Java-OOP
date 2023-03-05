package Video22Nasledjivanje.ZivotinjskoCarstvo;
/*
Kod nasledjivanja klasa neke klase proizilaze iz neke odredjene klase.
U slucaju da svaka od klasa (i ona iz koje izvodimo i one koje su izvedene)
imaju neku funkciju sa istim imenom, istim argumetima java dodeljuje
po difoltu svakoj klasi svoju funkciju.
A ako bismo zeleli da u izvedenoj klasi ispisemo funciju koja je u
klasi iz koje se izvodi, onda kucamo:
super.zvuk();
U konzoli ovo drugo aa je super.zvuk(); ispisan u klasi Pas.
 */

public class TestZivotinje {
    public static void main(String[] args) {
        //Zivotinja z = new Zivotinja("Pera", 2); // Ova zivotinja tj ovaj objekt ne moze da se kreira! Jer pripada apstraknoj klasi!
        Pas p = new Pas("zika", 2, "Bernandinac");
        Macka m = new Macka("micika", 2, "bela");

        //z.zvuk();
        p.zvuk();
        p.getRasa();// ovo je rasa psa p (zika)
        m.zvuk();

        /*
        Nadole cu da pisem o POLIFORMIZMU (POLOFORMIZAM):
        Mogucnost da idemo u sitna crevca.
        Struktura je takva da na vrhu imamo pojam zivotinja,
        a na dnu se nalaze pojmovi: nasi konkretni su pas i macka.
        Jer su oni neke zivotinje.
        Sve klase koje su izvedene iz klase zivotinja u sebi sadrze elemete te klase
        npr (funkcije)
        ne mozemo da napravio objekt klase zivotinja!!!
        ali mozemo da napravimo zivotinju koja je pas i
        zivotinju koja je macka!
        new Pas (argument), argumeti koji se nalaze u zagradi su oni koji su
        definisani unutar klase Pas.
        U slucaju da nemamo apstraktnu funkciju u klasi zivotinja,
        onda ne mozemo da je pozovemo u test clasi.
        problem* ovo se desava zato sto u svakoj klasi imamo napisane neke funkcije,
        getere, setere i tako dalje... ovo je povezano sa nasledjivanjem...
        sta od podataka prelazi sa vise klase na nizu klasu (izvedenu).
        Kada informacije nisu nasledjene i fali im funkcija, getera i setera
        Onda pri pozivu neke opcije, ta opcija crveni.
        zasto? pa kod za nju nije ispisan. I ne mozes da
        izvrsis funkciju koju nisi napisao.

        KOD POLIFORMIZMA, Imamo zivotinju koja je pas.
        i pitamo se koji je zvuk psa.
        program prvo ode do zivotinje (aa).
        tamo vidi da je to apstrakna funkcija i kaze,
        ako je ovo apstraktno mene interesuje koji je pravi zvuk.
        i potom ode do klase pas i procita (av av av).
         */

        Zivotinja z1 = new Pas("spajk", 3, "Buldog");
        Zivotinja z2 = new Macka("tom", 3, "Plavo-bela");

        z1.zvuk();// dakle, ako nemamo zvuk u klasi zivotinja, onda ovde ne mozemo da ga pozovemo.
        //z1.getrasa(); // z1 pas (spajk), ovo get ne funkcionise. problem*
        z2.zvuk();


    }

}
