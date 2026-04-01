package test9Cafenea.builder.clase;

public class RezervareBuilder implements IRezervare{
    private boolean lumanareParfumata;
    private String muzicaAmbientala;
    private boolean decor;

    public RezervareBuilder() {
        this.lumanareParfumata = false;
        this.muzicaAmbientala =null;
        this.decor = false;
    }

    public RezervareBuilder setLumanareParfumata(boolean lumanareParfumata) {
        this.lumanareParfumata = lumanareParfumata;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(String muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setDecor(boolean decor) {
        this.decor = decor;
        return this;
    }

    @Override
    public Rezervare build(int nrMasa, int nrPersoane) {
        return new Rezervare(nrMasa, nrPersoane, this.lumanareParfumata, this.muzicaAmbientala, this.decor);
    }
}
