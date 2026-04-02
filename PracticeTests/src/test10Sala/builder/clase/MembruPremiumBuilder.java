package test10Sala.builder.clase;

public class MembruPremiumBuilder implements IMembru{

    private boolean accesPiscina;
    private boolean antrenor;
    private boolean parcare;

    public MembruPremiumBuilder() {
        this.accesPiscina = false;
        this.antrenor = false;
        this.parcare = false;
    }

    public MembruPremiumBuilder setAccesPiscina(boolean accesPiscina) {
        this.accesPiscina = accesPiscina;
        return this;
    }

    public MembruPremiumBuilder setAntrenor(boolean antrenor) {
        this.antrenor = antrenor;
        return this;
    }

    public MembruPremiumBuilder setParcare(boolean parcare) {
        this.parcare = parcare;
        return this;
    }

    @Override
    public MembruPremium build(String nume, int cod) {
        return new MembruPremium(nume,cod, this.accesPiscina, this.antrenor, this.parcare);
    }
}
