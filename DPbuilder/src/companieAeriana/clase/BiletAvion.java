package companieAeriana.clase;

public class BiletAvion {
    protected String numePasager;
    protected String nrLoc;
    protected boolean mancare;
    protected boolean bagajCala;
    protected boolean loclaFereastra;

    public BiletAvion(String numePasager, String nrLoc, boolean mancare, boolean bagajCala, boolean loclaFereastra) {
        this.numePasager = numePasager;
        this.nrLoc = nrLoc;
        this.mancare = mancare;
        this.bagajCala = bagajCala;
        this.loclaFereastra = loclaFereastra;
    }

    public void setNumePasager(String numePasager) {
        this.numePasager = numePasager;
    }

    public void setNrLoc(String nrLoc) {
        this.nrLoc = nrLoc;
    }

    public void setMancare(boolean mancare) {
        this.mancare = mancare;
    }

    public void setBagajCala(boolean bagajCala) {
        this.bagajCala = bagajCala;
    }

    public void setLoclaFereastra(boolean loclaFereastra) {
        this.loclaFereastra = loclaFereastra;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletAvion{");
        sb.append("numePasager='").append(numePasager).append('\'');
        sb.append(", nrLoc='").append(nrLoc).append('\'');
        sb.append(", mancare=").append(mancare);
        sb.append(", bagajCala=").append(bagajCala);
        sb.append(", loclaFereastra=").append(loclaFereastra);
        sb.append('}');
        return sb.toString();
    }
}
