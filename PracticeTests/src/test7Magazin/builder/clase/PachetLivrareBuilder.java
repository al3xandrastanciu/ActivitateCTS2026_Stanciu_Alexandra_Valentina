package test7Magazin.builder.clase;

public class PachetLivrareBuilder implements IPachetLivrare{
    private boolean impachetarecadou;
    private boolean livrareUrgenta;
    private String mesajPersonalizat;
    private boolean asigurareContinut;

    public PachetLivrareBuilder() {
        this.impachetarecadou = false;
        this.livrareUrgenta = false;
        this.mesajPersonalizat = null;
        this.asigurareContinut = false;
    }

    public PachetLivrareBuilder setImpachetarecadou(boolean impachetarecadou) {
        this.impachetarecadou = impachetarecadou;
        return this;
    }

    public PachetLivrareBuilder setLivrareUrgenta(boolean livrareUrgenta) {
        this.livrareUrgenta = livrareUrgenta;
        return this;
    }

    public PachetLivrareBuilder setMesajPersonalizat(String mesajPersonalizat) {
        this.mesajPersonalizat = mesajPersonalizat;
        return this;
    }

    public PachetLivrareBuilder setAsigurareContinut(boolean asigurareContinut) {
        this.asigurareContinut = asigurareContinut;
        return this;
    }

    @Override
    public PachetLivrare build(String nrComanda) {
        return new PachetLivrare(nrComanda, this.impachetarecadou,this.livrareUrgenta, this.mesajPersonalizat, this.asigurareContinut);
    }
}
