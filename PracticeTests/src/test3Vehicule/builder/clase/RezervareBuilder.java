package test3Vehicule.builder.clase;

public class RezervareBuilder implements IRezervare{
    private boolean casca;
    private boolean cos;
    private boolean asigurare;
    private int nrKmInclusi;

    public RezervareBuilder() {
        this.casca = false;
        this.cos = false;
        this.asigurare = false;
        this.nrKmInclusi = 0;
    }

    public RezervareBuilder setCasca(boolean casca) {
        this.casca = casca;
        return this;
    }

    public RezervareBuilder setCos(boolean cos) {
        this.cos = cos;
        return this;
    }

    public RezervareBuilder setAsigurare(boolean asigurare) {
        this.asigurare = asigurare;
        return this;
    }

    public RezervareBuilder setNrKmInclusi(int nrKmInclusi) {
        this.nrKmInclusi = nrKmInclusi;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.casca, this.cos, this.asigurare, this.nrKmInclusi);
    }
}
