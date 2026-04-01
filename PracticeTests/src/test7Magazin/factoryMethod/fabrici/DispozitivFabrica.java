package test7Magazin.factoryMethod.fabrici;

import test7Magazin.factoryMethod.clase.Dispozitiv;

public interface DispozitivFabrica {
    public Dispozitiv getDispozitiv(String model, double pret);
}
