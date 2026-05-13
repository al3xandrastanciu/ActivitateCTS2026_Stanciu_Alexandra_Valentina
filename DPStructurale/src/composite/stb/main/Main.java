package composite.stb.main;

import composite.stb.clase.Autobuz;
import composite.stb.clase.Flota;
import composite.stb.clase.Grup;

public class Main {
    static void main(String[] args) {
        Flota grup1=new Grup("Grup 50 locuri");
        Flota autobuz=new Autobuz("MAN", "model1", 50);
        Flota autobuz2=new Autobuz("Mercedes", "model2", 50);

        Flota grup2=new Grup("Grup 10 locuri");
        Flota aut=new Autobuz("Mercedes", "model mic", 10);

        ((Grup)grup1).adaugaAutobuz(autobuz);
        ((Grup) grup1).adaugaAutobuz(autobuz2);
        grup1.afiseazaStructura("   ");

        ((Grup)grup2).adaugaAutobuz(aut);
        grup2.afiseazaStructura("  ");
    }
}
