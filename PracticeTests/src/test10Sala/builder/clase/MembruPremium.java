package test10Sala.builder.clase;

public class MembruPremium {
    protected String nume;
    protected int cod;
    protected boolean accesPiscina;
    protected boolean antrenor;
    protected boolean parcare;

    public MembruPremium(String nume, int cod, boolean accesPiscina, boolean antrenor, boolean parcare) {
        this.nume = nume;
        this.cod = cod;
        this.accesPiscina = accesPiscina;
        this.antrenor = antrenor;
        this.parcare = parcare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MembruPremium{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cod=").append(cod);
        sb.append(", accesPiscina=").append(accesPiscina);
        sb.append(", antrenor=").append(antrenor);
        sb.append(", parcare=").append(parcare);
        sb.append('}');
        return sb.toString();
    }
}
