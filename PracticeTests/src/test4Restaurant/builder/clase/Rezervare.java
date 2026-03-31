package test4Restaurant.builder.clase;

public class Rezervare {
    protected String numeClient;
    protected boolean masalaGeam;
    protected boolean scauncopil;
    protected boolean decoratiuni;
    protected String muzicaAmbientala;

    public Rezervare(String numeClient, boolean masalaGeam, boolean scauncopil, boolean decoratiuni, String muzicaAmbientala) {
        this.numeClient = numeClient;
        this.masalaGeam = masalaGeam;
        this.scauncopil = scauncopil;
        this.decoratiuni = decoratiuni;
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setMasalaGeam(boolean masalaGeam) {
        this.masalaGeam = masalaGeam;
    }

    public void setScauncopil(boolean scauncopil) {
        this.scauncopil = scauncopil;
    }

    public void setDecoratiuni(boolean decoratiuni) {
        this.decoratiuni = decoratiuni;
    }

    public void setMuzicaAmbientala(String muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", masalaGeam=").append(masalaGeam);
        sb.append(", scauncopil=").append(scauncopil);
        sb.append(", decoratiuni=").append(decoratiuni);
        sb.append(", muzicaAmbientala='").append(muzicaAmbientala).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
