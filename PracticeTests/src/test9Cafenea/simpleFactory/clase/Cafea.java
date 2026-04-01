package test9Cafenea.simpleFactory.clase;

public class Cafea implements IBautura {
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
}
