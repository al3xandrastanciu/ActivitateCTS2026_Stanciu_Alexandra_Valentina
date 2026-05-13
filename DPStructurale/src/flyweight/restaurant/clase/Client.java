package flyweight.restaurant.clase;

public class Client implements IClient{
    private String nume;
    private String telefon;
    private String mail;

    public Client(String nume, String telefon, String mail) {
        this.nume = nume;
        this.telefon = telefon;
        this.mail = mail;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" are rezervarea "+rezervare);
    }


}
