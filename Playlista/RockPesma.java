package Video24_5Dopunska.Vezbanje;

public class RockPesma extends Pesma{

    public RockPesma(String ime, int duzinaTrajanja) {
        super("Rock", ime, duzinaTrajanja);
    }

    @Override
    public String zvuk() {
        return "Rock Rock";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n").append("Ja volim Rock pesme");
        return sb.toString();
    }
}
