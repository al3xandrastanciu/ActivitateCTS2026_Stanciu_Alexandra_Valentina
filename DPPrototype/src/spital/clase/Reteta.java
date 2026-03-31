package spital.clase;

import java.util.Map;

public class Reteta implements IReteta{
    private String medicament;
    private Map<String, Double> cantitati;

    public Reteta() {
    }

    public Reteta(String medicament, Map<String, Double> cantitati) {
        this.medicament = medicament;
        this.cantitati = cantitati;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public void setCantitati(Map<String, Double> cantitati) {
        this.cantitati = cantitati;
    }

    @Override
    public IReteta copiaza() {
        Reteta reteta=new Reteta();
        reteta.medicament=this.medicament;
        reteta.cantitati=this.cantitati;
        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("medicament='").append(medicament).append('\'');
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }
}
