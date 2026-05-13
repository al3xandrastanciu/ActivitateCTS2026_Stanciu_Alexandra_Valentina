package composite.spital.main;

import composite.spital.clase.Departament;
import composite.spital.clase.Sectie;
import composite.spital.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura departament=new Departament("Spital");
        Structura sectie=new Sectie("Chirurgie", 5);
        Structura sectie2=new Sectie("Interne", 10);
        Structura departament2=new Departament("Resurse umane");
        Structura sectie3=new Sectie("HR", 15);

        ( (Departament) departament).adaugaStructura(sectie);
        ((Departament) departament).adaugaStructura(sectie2);
        ((Departament) departament2).adaugaStructura(sectie3);

        departament.afiseazaStructura("   ");

        departament2.afiseazaStructura("   ");
    }
}
