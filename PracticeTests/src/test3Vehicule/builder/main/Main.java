package test3Vehicule.builder.main;

import test3Vehicule.builder.clase.Rezervare;
import test3Vehicule.builder.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder=new RezervareBuilder();
        Rezervare rezervare=builder.setAsigurare(true).setCasca(true).setNrKmInclusi(5).build("Ana");
        System.out.println(rezervare);
    }
}
