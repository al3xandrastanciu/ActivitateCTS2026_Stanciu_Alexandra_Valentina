package observer.restaurant.clase;

import strategy.restaurant.clase.Client;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<IClient> clienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clienti=new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient client:clienti){
            client.primesteNotificare(mesaj+" de la restaurantul "+this.nume);
        }
    }

    @Override
    public void aboneazaClient(IClient client) {
        clienti.add(client);

    }

    @Override
    public void dezaboneazaClient(IClient client) {
        clienti.remove(client);

    }
    public void notificaPromotie(){
        trimiteNotificare("Avem o oferta");
    }
    public void notificaMeniuNou(){
        trimiteNotificare("Avem un meniu nou");
    }
}
