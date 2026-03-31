package test4Restaurant.factoryMethod.factory;

import test4Restaurant.factoryMethod.clase.IMeniu;
import test4Restaurant.factoryMethod.clase.MeniuCarnivor;

public class MeniuCarnivorFactory implements MeniuFactory{
    @Override
    public IMeniu creazaMeniu() {
        return new MeniuCarnivor();
    }
}
