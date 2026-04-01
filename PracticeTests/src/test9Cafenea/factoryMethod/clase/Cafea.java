package test9Cafenea.factoryMethod.clase;

public class Cafea implements IBautura{
    private String nume;
    private double volum;
    private double pret;

    public Cafea(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Cafeaua ").append(this.nume).append("se prepara.");
        System.out.println(sb.toString());
    }

    @Override
    public String getDetalii() {
        return "Cafea: Nume - "+this.nume+
                " Cantitate - "+this.volum+
                " Pret - "+this.pret;
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
