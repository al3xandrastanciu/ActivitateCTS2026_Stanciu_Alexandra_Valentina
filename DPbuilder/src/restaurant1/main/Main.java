package restaurant1.main;

import restaurant1.clase.Rezervare;
import restaurant1.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder=new RezervareBuilder();
        Rezervare rezervare=builder.setAsezareLaGeam(true).setScauneergonomice(false).setDecorare(false).setMuzicaAmbientala(true).build("Ana", "jazz");
        System.out.println(rezervare);
        Rezervare rezervare1=builder.setAsezareLaGeam(false).setDecorare(false).setScauneergonomice(true).setMuzicaAmbientala(false).build("Ion","fara muzica");
        System.out.println(rezervare1);
    }
}
