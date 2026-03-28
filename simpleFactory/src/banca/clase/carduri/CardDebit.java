package banca.clase.carduri;

public class CardDebit implements ConturiBancare{
    private String destinatar;
    private double suma;

    public CardDebit(String destinatar, double suma) {
        this.destinatar = destinatar;
        this.suma = suma;
    }

    @Override
    public void afisareCard() {
        StringBuilder sb=new StringBuilder();
        sb.append("Destinatar cont debit: ").append(this.destinatar).append(", Suma: ").append(this.suma);
        System.out.println(sb.toString());
    }
}
