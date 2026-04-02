package test10Sala.factoryMethod.fabrici;

import test10Sala.factoryMethod.clase.EchipamentGreutati;
import test10Sala.factoryMethod.clase.IEchipament;

public class EchipamentGreutatiFabrica implements EchipamentFabrica{
    @Override
    public IEchipament getEchipament(String nume) {
        return new EchipamentGreutati(nume);
    }
}
