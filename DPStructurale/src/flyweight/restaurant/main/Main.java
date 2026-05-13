package flyweight.restaurant.main;

import flyweight.restaurant.clase.Client;
import flyweight.restaurant.clase.IClient;
import flyweight.restaurant.clase.RegistruClienti;
import flyweight.restaurant.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        RegistruClienti registruClienti=new RegistruClienti();

        IClient client=new Client("Ion", "0825311572", "aaa");
        IClient client1=new Client("GUjs", "0825172651", "bbb");

        Rezervare rezervare=new Rezervare(4,5, "20:00");
        client.printeazaRezervare(rezervare);

        registruClienti.getClient("Ana", "0825311572", "aaa").printeazaRezervare(rezervare);
    }
}
