package restaurant1.clase;

public class RezervareBuilder implements RezervareAbstract{
    private boolean asezareLaGeam;
    private boolean scauneergonomice;
    private boolean decorare;
    private boolean muzicaAmbientala;

    public RezervareBuilder() {
        this.asezareLaGeam = false;
        this.scauneergonomice = false;
        this.decorare = false;
        this.muzicaAmbientala = false;
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilder setScauneergonomice(boolean scauneergonomice) {
        this.scauneergonomice = scauneergonomice;
        return this;
    }

    public RezervareBuilder setDecorare(boolean decorare) {
        this.decorare = decorare;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    @Override
    public Rezervare build(String numeClient, String genMuzica) {
        Rezervare rezervare=new Rezervare(numeClient, this.asezareLaGeam, this.scauneergonomice, this.decorare, this.muzicaAmbientala, genMuzica);
        return rezervare;
    }
}
