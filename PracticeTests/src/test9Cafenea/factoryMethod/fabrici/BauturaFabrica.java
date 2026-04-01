package test9Cafenea.factoryMethod.fabrici;

import test9Cafenea.factoryMethod.clase.IBautura;

public interface BauturaFabrica {
    public IBautura getBautura(String nume, double volum, double pret);
}
