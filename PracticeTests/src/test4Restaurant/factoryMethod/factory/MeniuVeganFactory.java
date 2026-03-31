package test4Restaurant.factoryMethod.factory;

import test4Restaurant.factoryMethod.clase.IMeniu;
import test4Restaurant.factoryMethod.clase.MeniuVegan;

public class MeniuVeganFactory implements MeniuFactory{
    @Override
    public IMeniu creazaMeniu() {
        return new MeniuVegan();
    }
}
