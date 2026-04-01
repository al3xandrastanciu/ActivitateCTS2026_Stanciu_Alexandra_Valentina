package test8.factoryMethod.fabrici;

import test8.factoryMethod.clase.Vehicul;

public interface VehiculFabrica {
    public Vehicul fabricaVehicul(String nrInmatriculare, String model);
}
