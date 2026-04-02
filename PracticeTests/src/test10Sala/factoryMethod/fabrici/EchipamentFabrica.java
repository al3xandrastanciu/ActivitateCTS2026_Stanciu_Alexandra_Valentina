package test10Sala.factoryMethod.fabrici;

import test10Sala.factoryMethod.clase.IEchipament;

public interface EchipamentFabrica {
    public IEchipament getEchipament(String nume);
}
