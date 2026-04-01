package test7Magazin.factoryMethod.fabrici;

import test7Magazin.factoryMethod.clase.Dispozitiv;
import test7Magazin.factoryMethod.clase.Tableta;

public class TabletaFabrica implements DispozitivFabrica{
    @Override
    public Dispozitiv getDispozitiv(String model, double pret) {
        return new Tableta(model, pret);
    }
}
