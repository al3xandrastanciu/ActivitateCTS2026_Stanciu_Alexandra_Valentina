package test6CompanieAeriana.factoryMethod.factory;

import test6CompanieAeriana.factoryMethod.clase.AvionCargo;
import test6CompanieAeriana.factoryMethod.clase.IAvion;

public class CargoFactory implements AvionFactory{
    @Override
    public IAvion creareAvion() {
        return new AvionCargo();
    }
}
