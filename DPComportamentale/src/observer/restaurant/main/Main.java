package observer.restaurant.main;

import observer.restaurant.clase.ClientAbonat;
import observer.restaurant.clase.IClient;
import observer.restaurant.clase.IRestaurant;
import observer.restaurant.clase.Restaurant;

public class Main {
    static void main(String[] args) {
        IClient client=new ClientAbonat("Alex");
        IClient client1=new ClientAbonat("Vali");

        IRestaurant restaurant=new Restaurant("Italian");
        restaurant.aboneazaClient(client);
        restaurant.aboneazaClient(client1);
        ((Restaurant)restaurant).notificaMeniuNou();
    }
}
