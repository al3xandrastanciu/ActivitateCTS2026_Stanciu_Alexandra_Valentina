package test9Cafenea.builder.main;

import test9Cafenea.builder.clase.Rezervare;
import test9Cafenea.builder.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder=new RezervareBuilder();
        Rezervare rezervare=builder.setMuzicaAmbientala("jazz").setDecor(true).build(4, 9);
        System.out.println(rezervare);
        Rezervare rezervare1=builder.setLumanareParfumata(true).build(2, 2);
        System.out.println(rezervare1);
    }
}
