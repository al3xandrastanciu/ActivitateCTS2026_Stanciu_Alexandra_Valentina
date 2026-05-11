package proxy.restaurant.clase;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int nrPersoane;

    public Rezervare(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void realizeazaRezervare() {
        System.out.println("Clientul "+this.numeClient+" a facut o rezervare de "+this.nrPersoane+" persoane");
    }
}
