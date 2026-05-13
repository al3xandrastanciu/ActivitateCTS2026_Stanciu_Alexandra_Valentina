package composite.spital.clase;

public class Sectie implements Structura{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Sectia "+this.nume+" are "+this.nrAngajati+" angajati");
    }
}
