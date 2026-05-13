package strategy.spital.clase;

public class Pacient {
    private String nume;
    private ModalitateDePlata modalitateDePlata;

    public Pacient(String nume) {
        this.nume = nume;
        this.modalitateDePlata=new Card();
    }

    public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }
    public void plateste(double suma){
        modalitateDePlata.plateste(this.nume, suma);
    }
}
