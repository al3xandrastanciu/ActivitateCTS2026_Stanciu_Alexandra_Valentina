package observer.restaurant.clase;

public interface IRestaurant {
    void trimiteNotificare(String mesaj);
    void aboneazaClient(IClient client);
    void dezaboneazaClient(IClient client);
}
