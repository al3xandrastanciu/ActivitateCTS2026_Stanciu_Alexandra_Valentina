package test4Restaurant.builder.main;

import test4Restaurant.builder.clase.Rezervare;
import test4Restaurant.builder.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder=new RezervareBuilder();
        Rezervare rezervare=builder.setMasalaGeam(true).setDecoratiuni(true).setMuzicaAmbientala("muzica jazz").build("Ioana");
        System.out.println(rezervare);
        Rezervare rezervare1=builder.setDecoratiuni(false).setScauncopil(true).setMuzicaAmbientala("").build("Maria");
        System.out.println(rezervare1);
    }
}
