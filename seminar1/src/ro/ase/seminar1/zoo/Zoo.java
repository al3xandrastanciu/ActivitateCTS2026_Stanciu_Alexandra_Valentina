package ro.ase.seminar1.zoo;

import ro.ase.seminar1.Zookeeper;
import ro.ase.seminar1.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    Zookeeper zookeeper;
    List<Animal> animale;

    public Zoo(String nume, Zookeeper zookeeper) {
        this.nume = nume;
        this.zookeeper = zookeeper;
        this.animale = new ArrayList<>();
    }
    public void feedAnimale(){
        for(Animal animal:animale){
            zookeeper.feedAllAnimals(animal);
        }
    }
    public void addAnimal(Animal animal){animale.add(animal);}
}
