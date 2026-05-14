package composite.banca.clase;

public class Filiala implements Structura{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare+"filiala: "+this.nume);
    }
}
