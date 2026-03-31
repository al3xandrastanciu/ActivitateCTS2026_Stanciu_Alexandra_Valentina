package test3Vehicule.factoryMethod.factory;

import test3Vehicule.factoryMethod.clase.Vehicul;

public interface VehiculFactory {
    public Vehicul creareVehicul(int id, String culoare);
}
