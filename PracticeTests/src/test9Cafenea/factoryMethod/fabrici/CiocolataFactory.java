package test9Cafenea.factoryMethod.fabrici;

import test9Cafenea.factoryMethod.clase.Ciocolata;
import test9Cafenea.factoryMethod.clase.IBautura;

public class CiocolataFactory implements BauturaFabrica{
    @Override
    public IBautura getBautura(String nume, double volum, double pret) {
        return new Ciocolata(nume, volum, pret);
    }
}
