package banca.clase;

import java.util.Map;

public class Cont implements ICont{
    private String nume;
    private Map<String, Boolean> documente;

    public Cont() {
    }

    public Cont(String nume, Map<String, Boolean> documente) {
        this.nume = nume;
        this.documente = documente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDocumente(Map<String, Boolean> documente) {
        this.documente = documente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", documente=").append(documente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ICont copiaza() {
       Cont cont=new Cont();
       cont.setNume(this.nume);
       cont.setDocumente(this.documente);
       return cont;
    }
}
