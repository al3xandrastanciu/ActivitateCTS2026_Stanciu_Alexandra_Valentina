package composite.main;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura dep1=new Departament("Spital" );
        Structura depAdmin=new Departament("Administrativ");
        Structura sectie1=new Sectie("Secretariat", 3);
        Structura sectie2=new Sectie("Management", 5);

        ( (Departament) dep1).adaugaStructura(depAdmin);
        ( (Departament) dep1).adaugaStructura(sectie2);
        ( (Departament) depAdmin).adaugaStructura(sectie1);
        dep1.afiseazaDetaliiStructura("   ");
        ((Departament) dep1).stergeStructura(sectie2);
        ((Departament) depAdmin).adaugaStructura(sectie2);
        dep1.afiseazaDetaliiStructura("  ");

    }
}
