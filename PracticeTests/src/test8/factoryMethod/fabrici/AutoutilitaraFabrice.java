package test8.factoryMethod.fabrici;

import test8.factoryMethod.clase.Autoutilitara;
import test8.factoryMethod.clase.Vehicul;

public class AutoutilitaraFabrice implements VehiculFabrica{
    @Override
    public Vehicul fabricaVehicul(String nrInmatriculare, String model) {
        return new Autoutilitara(nrInmatriculare, model);
    }
}
