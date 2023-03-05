package Video24_5Dopunska.Vezbanje;

public class PopPesma extends Pesma{

    public PopPesma(String ime, int duzinaTrajanja) {
        super("Pop", ime, duzinaTrajanja);
    }

    @Override
    public String zvuk() {
        return "Pop Pop";
    }


}
