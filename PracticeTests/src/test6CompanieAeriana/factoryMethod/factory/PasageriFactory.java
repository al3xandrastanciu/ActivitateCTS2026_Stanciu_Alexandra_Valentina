package test6CompanieAeriana.factoryMethod.factory;

import test6CompanieAeriana.factoryMethod.clase.AvionPasageri;
import test6CompanieAeriana.factoryMethod.clase.IAvion;

public class PasageriFactory implements AvionFactory{
    @Override
    public IAvion creareAvion() {
        return new AvionPasageri();
    }
}
