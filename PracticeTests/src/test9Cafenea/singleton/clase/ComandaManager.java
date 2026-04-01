package test9Cafenea.singleton.clase;

import test9Cafenea.factoryMethod.clase.IBautura;

public interface ComandaManager {
    public void afisareComanda();
    public void adaugaBautura(IBautura bautura);
    public double calculeazaPret();
}
