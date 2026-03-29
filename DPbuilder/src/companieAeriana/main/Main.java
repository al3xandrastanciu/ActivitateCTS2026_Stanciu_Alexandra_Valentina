package companieAeriana.main;

import companieAeriana.clase.BiletAvion;
import companieAeriana.clase.BiletAvionBuilder;

public class Main {
    public static void main(String[] args) {
        BiletAvionBuilder builder=new BiletAvionBuilder();
        BiletAvion biletAvion=builder.setMancare(false).setBagajCala(true).setLoclaFereastra(true).build("Ana Maria", "34C");
        System.out.println(biletAvion);
    }
}
