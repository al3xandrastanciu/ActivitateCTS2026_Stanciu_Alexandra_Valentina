package test9Cafenea.factoryMethod.fabrici;

import test9Cafenea.factoryMethod.clase.Cafea;
import test9Cafenea.factoryMethod.clase.IBautura;

public class CafeaFactory implements BauturaFabrica{
    @Override
    public IBautura getBautura(String nume, double volum, double pret) {
        return new Cafea(nume, volum, pret);
    }
}
