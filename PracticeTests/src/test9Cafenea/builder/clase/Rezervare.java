package test9Cafenea.builder.clase;

public class Rezervare {
    protected int nrMasa;
    protected int nrPersoane;
    protected boolean lumanareParfumata;
    protected String muzicaAmbientala;
    protected boolean decor;

    public Rezervare(int nrMasa, int nrPersoane, boolean lumanareParfumata, String muzicaAmbientala, boolean decor) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.lumanareParfumata = lumanareParfumata;
        this.muzicaAmbientala = muzicaAmbientala;
        this.decor = decor;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", lumanareParfumata=").append(lumanareParfumata);
        sb.append(", muzicaAmbientala='").append(muzicaAmbientala).append('\'');
        sb.append(", decor=").append(decor);
        sb.append('}');
        return sb.toString();
    }
}
