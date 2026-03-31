package test3Vehicule.factoryMethod.factory;

import test3Vehicule.factoryMethod.clase.Trotineta;
import test3Vehicule.factoryMethod.clase.Vehicul;

public class TrotinetaFactory implements VehiculFactory{
    @Override
    public Vehicul creareVehicul(int id, String culoare) {
        return new Trotineta(id, culoare);
    }
}
