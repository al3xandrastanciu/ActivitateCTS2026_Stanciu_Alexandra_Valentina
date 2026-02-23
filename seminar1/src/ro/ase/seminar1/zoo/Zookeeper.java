package ro.ase.seminar1;

import ro.ase.seminar1.animale.Animal;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }
    public void feedAllAnimals(Animal animal) {
        System.out.println("Zookeeper-ul "+name+" a hranit animalul "+animal.toString());
        animal.eat("mancare");
    }
}
