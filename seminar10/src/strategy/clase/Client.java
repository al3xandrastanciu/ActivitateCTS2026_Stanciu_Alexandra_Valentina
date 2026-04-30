package strategy.clase;

public class Client {
    private String nume;
    private ModalitateDePlata modalitateDePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitateDePlata = new PlataCard();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }
    public void plateste(double suma){
        modalitateDePlata.plateste(this.nume, suma);
    }
}
