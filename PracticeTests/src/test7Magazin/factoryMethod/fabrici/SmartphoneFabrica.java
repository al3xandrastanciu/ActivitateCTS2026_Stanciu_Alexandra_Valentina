package test7Magazin.factoryMethod.fabrici;

import test7Magazin.factoryMethod.clase.Dispozitiv;
import test7Magazin.factoryMethod.clase.Smartphone;

public class SmartphoneFabrica implements DispozitivFabrica{
    @Override
    public Dispozitiv getDispozitiv(String model, double pret) {
        return new Smartphone(model, pret);
    }
}
