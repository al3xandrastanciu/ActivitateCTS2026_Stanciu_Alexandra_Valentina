package test3Vehicule.builder.clase;

public class Rezervare {
    protected String numeClient;
    protected boolean casca;
    protected boolean cos;
    protected boolean asigurare;
    protected int nrKmInclusi;

    public Rezervare(String numeClient, boolean casca, boolean cos, boolean asigurare, int nrKmInclusi) {
        this.numeClient = numeClient;
        this.casca = casca;
        this.cos = cos;
        this.asigurare = asigurare;
        this.nrKmInclusi = nrKmInclusi;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setCasca(boolean casca) {
        this.casca = casca;
    }

    public void setCos(boolean cos) {
        this.cos = cos;
    }

    public void setAsigurare(boolean asigurare) {
        this.asigurare = asigurare;
    }

    public void setNrKmInclusi(int nrKmInclusi) {
        this.nrKmInclusi = nrKmInclusi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", casca=").append(casca);
        sb.append(", cos=").append(cos);
        sb.append(", asigurare=").append(asigurare);
        sb.append(", nrKmInclusi=").append(nrKmInclusi);
        sb.append('}');
        return sb.toString();
    }
}
