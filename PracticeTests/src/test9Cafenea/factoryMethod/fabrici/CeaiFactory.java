package test9Cafenea.factoryMethod.fabrici;

import test9Cafenea.factoryMethod.clase.Ceai;
import test9Cafenea.factoryMethod.clase.IBautura;

public class CeaiFactory implements BauturaFabrica{
    @Override
    public IBautura getBautura(String nume, double volum, double pret) {
        return new Ceai(nume, volum, pret);
    }
}
