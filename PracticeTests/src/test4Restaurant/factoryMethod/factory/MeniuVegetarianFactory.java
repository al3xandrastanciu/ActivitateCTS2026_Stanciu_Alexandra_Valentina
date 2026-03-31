package test4Restaurant.factoryMethod.factory;

import test4Restaurant.factoryMethod.clase.IMeniu;
import test4Restaurant.factoryMethod.clase.MeniuVegetarian;

public class MeniuVegetarianFactory implements MeniuFactory{
    @Override
    public IMeniu creazaMeniu() {
        return new MeniuVegetarian();
    }
}
