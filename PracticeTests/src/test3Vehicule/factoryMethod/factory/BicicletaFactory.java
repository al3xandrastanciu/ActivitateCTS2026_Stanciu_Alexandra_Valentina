package test3Vehicule.factoryMethod.factory;

import test3Vehicule.factoryMethod.clase.Bicicleta;
import test3Vehicule.factoryMethod.clase.Vehicul;

public class BicicletaFactory implements VehiculFactory{
    @Override
    public Vehicul creareVehicul(int id, String culoare) {
        return new Bicicleta(id, culoare);
    }
}
