package test10Sala.simpleFactory.clase;

public class AbonamentCrossfit implements IAbonament{
    private String nume;
    private int perioada;
    private int pret;

    public AbonamentCrossfit(String nume, int perioada, int pret) {
        this.nume = nume;
        this.perioada = perioada;
        this.pret = pret;
    }

    @Override
    public String getDetalii() {
        return "Abonament crossfit: Nume: "+this.nume+" , perioada: "+this.perioada+" ,pret:"+this.pret;
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
