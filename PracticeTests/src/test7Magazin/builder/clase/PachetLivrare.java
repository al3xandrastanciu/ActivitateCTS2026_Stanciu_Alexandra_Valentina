package test7Magazin.builder.clase;

public class PachetLivrare {
    protected String nrComanda;
    protected boolean impachetarecadou;
    protected boolean livrareUrgenta;
    protected String mesajPersonalizat;
    protected boolean asigurareContinut;

    public PachetLivrare(String nrComanda, boolean impachetarecadou, boolean livrareUrgenta, String mesajPersonalizat, boolean asigurareContinut) {
        this.nrComanda = nrComanda;
        this.impachetarecadou = impachetarecadou;
        this.livrareUrgenta = livrareUrgenta;
        this.mesajPersonalizat = mesajPersonalizat;
        this.asigurareContinut = asigurareContinut;
    }

    public void setNrComanda(String nrComanda) {
        this.nrComanda = nrComanda;
    }

    public void setImpachetarecadou(boolean impachetarecadou) {
        this.impachetarecadou = impachetarecadou;
    }

    public void setLivrareUrgenta(boolean livrareUrgenta) {
        this.livrareUrgenta = livrareUrgenta;
    }

    public void setMesajPersonalizat(String mesajPersonalizat) {
        this.mesajPersonalizat = mesajPersonalizat;
    }

    public void setAsigurareContinut(boolean asigurareContinut) {
        this.asigurareContinut = asigurareContinut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetLivrare{");
        sb.append("nrComanda='").append(nrComanda).append('\'');
        sb.append(", impachetarecadou=").append(impachetarecadou);
        sb.append(", livrareUrgenta=").append(livrareUrgenta);
        sb.append(", mesajPersonalizat='").append(mesajPersonalizat).append('\'');
        sb.append(", asigurareContinut=").append(asigurareContinut);
        sb.append('}');
        return sb.toString();
    }
}
