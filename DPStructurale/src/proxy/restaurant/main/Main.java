package proxy.restaurant.main;

import proxy.restaurant.clase.ProxyRezervare;
import proxy.restaurant.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Maria", 5);
        Rezervare rezervare1=new Rezervare("Marius", 2);
        ProxyRezervare proxy=new ProxyRezervare(rezervare);
        proxy.realizeazaRezervare();

        ProxyRezervare proxy2=new ProxyRezervare(rezervare1);
        proxy2.realizeazaRezervare();
    }
}
