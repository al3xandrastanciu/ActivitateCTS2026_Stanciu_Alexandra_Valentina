package proxy.restaurant.clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare() {
        if(rezervare.getNrPersoane()>=4){
            rezervare.realizeazaRezervare();
        }else {
            System.out.println("Rezervarea se face doar pt minim 4 persoane");
        }
    }
}
