package test4Restaurant.factoryMethod.main;

import test4Restaurant.factoryMethod.clase.IMeniu;
import test4Restaurant.factoryMethod.clase.MeniuVegan;
import test4Restaurant.factoryMethod.factory.MeniuCarnivorFactory;
import test4Restaurant.factoryMethod.factory.MeniuFactory;
import test4Restaurant.factoryMethod.factory.MeniuVeganFactory;
import test4Restaurant.factoryMethod.factory.MeniuVegetarianFactory;

public class Main {
    public static void main(String[] args) {
        MeniuFactory factory=new MeniuVeganFactory();
        IMeniu vegan=factory.creazaMeniu();
        MeniuFactory factory1=new MeniuVegetarianFactory();
        IMeniu vegetarian=factory1.creazaMeniu();
        MeniuFactory factory2=new MeniuCarnivorFactory();
        IMeniu carnivor=factory2.creazaMeniu();
        vegan.afisareIngrediente();
        vegetarian.afisareIngrediente();
        carnivor.afisareIngrediente();
    }
}
