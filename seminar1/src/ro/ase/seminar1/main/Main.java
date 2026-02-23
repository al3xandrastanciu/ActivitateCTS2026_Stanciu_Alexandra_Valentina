package ro.ase.seminar1.main;

import ro.ase.seminar1.Zookeeper;
import ro.ase.seminar1.animale.Lion;
import ro.ase.seminar1.animale.Tiger;
import ro.ase.seminar1.animale.Zebra;
import ro.ase.seminar1.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper=new Zookeeper("Andrei");
        Lion lion1=new Lion("Simba",4,350);
        Zebra zebra1=new Zebra("Marty",3,220);
        Tiger tigru1=new Tiger("Tigrutu", 9, "Bengalez");
        Zoo zoo=new Zoo("Gradina zoo", zookeeper);
        zoo.addAnimal(lion1);
        zoo.addAnimal(zebra1);
        zoo.addAnimal(tigru1);
        zoo.feedAnimale();
    }
}
