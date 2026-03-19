package ro.ase.seminar6.prototype.main;

import ro.ase.seminar6.prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Ioana", 12, 4, "1453678956345623");
        Rezervare rezervare1=(Rezervare) rezervare.copiaza();
        rezervare1.setOra(13);
        System.out.println(rezervare1);
    }
}
