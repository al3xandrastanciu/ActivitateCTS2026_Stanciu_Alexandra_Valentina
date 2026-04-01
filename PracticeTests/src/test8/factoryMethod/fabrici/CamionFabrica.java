package test8.factoryMethod.fabrici;

import test8.factoryMethod.clase.Camion;
import test8.factoryMethod.clase.Vehicul;

public class CamionFabrica implements VehiculFabrica{
    @Override
    public Vehicul fabricaVehicul(String nrInmatriculare, String model) {
        return new Camion(nrInmatriculare, model);
    }
}
