package composite.restaurant.main;

import composite.restaurant.clase.Item;
import composite.restaurant.clase.Produs;
import composite.restaurant.clase.Sectiune;

public class Main {
    static void main(String[] args) {
        Item sectiune=new Sectiune("Supe");
        Item produs=new Produs("Supa de legume", 20);
        Item sectiune2=new Sectiune("Bauturi");
        Item produs2=new Produs("Apa", 5);
        Item produs3=new Produs("Cafea", 10);

        ((Sectiune)sectiune).adaugaProdus(produs);
        sectiune.afiseazaStructura("   ");
        ((Sectiune) sectiune2).adaugaProdus(produs2);
        ((Sectiune) sectiune2).adaugaProdus(produs3);
        sectiune2.afiseazaStructura("    ");
    }
}
