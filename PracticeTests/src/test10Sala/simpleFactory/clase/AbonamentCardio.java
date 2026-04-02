package test10Sala.simpleFactory.clase;

public class AbonamentCardio implements IAbonament{
    private String nume;
    private int perioada;
    private int pret;

    public AbonamentCardio(String nume, int perioada, int pret) {
        this.nume = nume;
        this.perioada = perioada;
        this.pret = pret;
    }

    @Override
    public String getDetalii() {
        return "Abonament cardio: Nume: "+this.nume+" , perioada: "+this.perioada+" ,pret:"+this.pret;
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
