package prototype.clase;

import java.util.List;

public class Jucator implements IJucator{
    private String nume;
    private String pozitie;
    private List<String> antrenamente;
    private List<String> medicamente;

    public Jucator() {
    }

    public Jucator(String nume, String pozitie, List<String> antrenamente, List<String> medicamente) {
        this.nume = nume;
        this.pozitie = pozitie;
        this.antrenamente = antrenamente;
        this.medicamente = medicamente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = antrenamente;
    }

    public void setMedicamente(List<String> medicamente) {
        this.medicamente = medicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pozitie='").append(pozitie).append('\'');
        sb.append(", antrenamente=").append(antrenamente);
        sb.append(", medicamente=").append(medicamente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IJucator copiaza() {
        Jucator jucator=new Jucator();
        jucator.nume=this.nume;
        jucator.pozitie=this.pozitie;
        jucator.antrenamente=this.antrenamente;
        jucator.medicamente=this.medicamente;
        return jucator;
    }


}
