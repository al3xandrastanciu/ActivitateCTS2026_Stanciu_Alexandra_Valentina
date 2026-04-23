package proxy.clase;

public class Pacient {
    private String nume;
    private boolean asigurare;

    public Pacient(String nume, boolean asigurare) {
        this.nume = nume;
        this.asigurare = asigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAsigurare() {
        return asigurare;
    }
}
