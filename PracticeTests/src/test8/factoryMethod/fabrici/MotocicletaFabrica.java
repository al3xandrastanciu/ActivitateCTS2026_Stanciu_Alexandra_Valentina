package test8.factoryMethod.fabrici;

import test8.factoryMethod.clase.Motocicleta;
import test8.factoryMethod.clase.Vehicul;

public class MotocicletaFabrica implements VehiculFabrica{
    @Override
    public Vehicul fabricaVehicul(String nrInmatriculare, String model) {
        return new Motocicleta(nrInmatriculare, model);
    }
}
