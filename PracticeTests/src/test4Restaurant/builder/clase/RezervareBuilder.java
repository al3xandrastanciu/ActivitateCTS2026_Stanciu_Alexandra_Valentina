package test4Restaurant.builder.clase;

public class RezervareBuilder implements IRezervare{
    private boolean masalaGeam;
    private boolean scauncopil;
    private boolean decoratiuni;
    private String muzicaAmbientala;

    public RezervareBuilder() {
        this.masalaGeam = false;
        this.scauncopil = false;
        this.decoratiuni = false;
        this.muzicaAmbientala = "";
    }

    public RezervareBuilder setMasalaGeam(boolean masalaGeam) {
        this.masalaGeam = masalaGeam;
        return this;
    }

    public RezervareBuilder setScauncopil(boolean scauncopil) {
        this.scauncopil = scauncopil;
        return this;
    }

    public RezervareBuilder setDecoratiuni(boolean decoratiuni) {
        this.decoratiuni = decoratiuni;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(String muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.masalaGeam, this.scauncopil, this.decoratiuni, this.muzicaAmbientala);
    }
}
