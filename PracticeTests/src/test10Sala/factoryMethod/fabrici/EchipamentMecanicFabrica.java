package test10Sala.factoryMethod.fabrici;

import test10Sala.factoryMethod.clase.EchipamentMecanic;
import test10Sala.factoryMethod.clase.IEchipament;

public class EchipamentMecanicFabrica implements EchipamentFabrica{
    @Override
    public IEchipament getEchipament(String nume) {
        return new EchipamentMecanic(nume);
    }
}
