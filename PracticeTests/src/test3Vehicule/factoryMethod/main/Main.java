package test3Vehicule.factoryMethod.main;

import test3Vehicule.factoryMethod.clase.Vehicul;
import test3Vehicule.factoryMethod.factory.BicicletaFactory;
import test3Vehicule.factoryMethod.factory.TrotinetaFactory;
import test3Vehicule.factoryMethod.factory.VehiculFactory;

public class Main {
    public static void main(String[] args) {
        VehiculFactory factory=new BicicletaFactory();
        Vehicul bicicleta=factory.creareVehicul(2, "verde");
        bicicleta.afisare();
        VehiculFactory factory1=new TrotinetaFactory();
        Vehicul trotineta=factory1.creareVehicul(1, "rosie");
        trotineta.afisare();
    }
}
