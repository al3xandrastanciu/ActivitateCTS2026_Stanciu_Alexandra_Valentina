package restaurant1.clase;

public class Rezervare {
    protected String numeClient;
    protected boolean asezareLaGeam;
    protected boolean scauneergonomice;
    protected boolean decorare;
    protected boolean muzicaAmbientala;
    protected String genMuzica;

    public Rezervare(String numeClient, boolean asezareLaGeam, boolean scauneergonomice, boolean decorare, boolean muzicaAmbientala, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareLaGeam = asezareLaGeam;
        this.scauneergonomice = scauneergonomice;
        this.decorare = decorare;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneergonomice(boolean scauneergonomice) {
        this.scauneergonomice = scauneergonomice;
    }

    public void setDecorare(boolean decorare) {
        this.decorare = decorare;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneergonomice=").append(scauneergonomice);
        sb.append(", decorare=").append(decorare);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
