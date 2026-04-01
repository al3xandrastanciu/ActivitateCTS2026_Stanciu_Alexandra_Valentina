package test7Magazin.factoryMethod.fabrici;

import test7Magazin.factoryMethod.clase.Dispozitiv;
import test7Magazin.factoryMethod.clase.Laptop;

public class LaptopFabrica implements DispozitivFabrica{
    @Override
    public Dispozitiv getDispozitiv(String model, double pret) {
        return new Laptop(model, pret);
    }
}
