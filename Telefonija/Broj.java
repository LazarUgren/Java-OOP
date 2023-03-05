package Video26ResenjeTestaIApachePOI.Telefonija;

public class Broj {
    private String kodDrzave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksni;

    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksni) throws ArithmeticException{
        boolean validanBroj = proveriBroj(kodDrzave, pozivniBroj, broj);
        if (validanBroj == false){
            System.out.println("Broj nije validan");
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        }

        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksni = fiksni;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) throws ArithmeticException{
        boolean validanBroj = proveriBroj(kodDrzave, pozivniBroj, broj);
        if (validanBroj == false){
            System.out.println("Broj nije validan");
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        }
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) throws ArithmeticException {
        boolean validanBroj = proveriBroj(kodDrzave, pozivniBroj, broj);
        if (validanBroj == false){
            System.out.println("Broj nije validan");
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        }
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) throws ArithmeticException {
        boolean validanBroj = proveriBroj(kodDrzave,pozivniBroj,broj);
        if (validanBroj == false){
            System.out.println("Broj nije validan");
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        }
        this.broj = broj;
    }

    public boolean getFiksni() {
        return fiksni;
    }

    public void setFiksni(boolean fiksni) throws ArithmeticException {
        boolean validanBroj = proveriBroj(kodDrzave, pozivniBroj, broj);
        if (validanBroj == false){
            System.out.println("Broj nije validan");
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        }
        this.fiksni = fiksni;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("+");
        sb.append(kodDrzave);
        sb.append(" ");
        sb.append(pozivniBroj);
        sb.append(" ");
        sb.append(broj);

        return sb.toString();
    }

    private static boolean proveriDaLiStringSadrziSamoNumerike(String str){
        // pretpostavka da sadrzi
        boolean sadziSamoNumerike = true;

        // vidim kolika je duzina Striga
        int duzinaStringa = str.length();

        // prolazim kroz string od pocetka do kraja
        for (int i = 0; i < str.length(); i++){
            // dohvatim karakter na poziciji
            char karakterNaPozicijiI = str.charAt(i);

            // proveravam da li je karakter na toj poziciji numerik
            if (Character.isDigit(karakterNaPozicijiI) == false){
                //ako nije kazem da moja pocetna pretpostavka nije tacna i break
                sadziSamoNumerike = false;
                break;
            }
        }
        return sadziSamoNumerike;
    }

    private static boolean proveriBroj (String kodDrzave, String pozivniBroj, String broj){
        boolean kodDrzaveSadrziSamoNumerike = proveriDaLiStringSadrziSamoNumerike(kodDrzave);
        if (kodDrzave == null || kodDrzave.length() != 3 || kodDrzaveSadrziSamoNumerike == false){
            return false;
        }

        boolean pozivniBrojSadrziSamoNumerike = proveriDaLiStringSadrziSamoNumerike(pozivniBroj);
        if (broj == null || (broj.length() != 7 && broj.length() != 8) || pozivniBrojSadrziSamoNumerike == false){
            return false;
        }

        boolean brojSadrziSamoNumerike = proveriDaLiStringSadrziSamoNumerike(broj);
        if (broj == null || (broj.length() != 7 && broj.length() != 8) || brojSadrziSamoNumerike == false){
            return false;
        }
        return true;
    }
}
