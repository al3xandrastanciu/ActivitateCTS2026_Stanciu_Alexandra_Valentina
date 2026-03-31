package test6CompanieAeriana.factoryMethod.factory;

import test6CompanieAeriana.factoryMethod.clase.AvionPrivat;
import test6CompanieAeriana.factoryMethod.clase.IAvion;

public class PrivatFactory implements  AvionFactory{
    @Override
    public IAvion creareAvion() {
        return new AvionPrivat();
    }
}
