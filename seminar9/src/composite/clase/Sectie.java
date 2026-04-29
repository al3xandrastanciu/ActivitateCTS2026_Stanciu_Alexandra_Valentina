package composite.clase;

public class Sectie implements Structura{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume sectie: "+this.nume+" , nr angajati: "+this.nrAngajati);
    }
}
