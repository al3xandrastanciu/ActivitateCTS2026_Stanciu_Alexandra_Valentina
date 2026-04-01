package test8.factoryMethod.main;

import test8.factoryMethod.clase.Vehicul;
import test8.factoryMethod.fabrici.MotocicletaFabrica;
import test8.factoryMethod.fabrici.VehiculFabrica;

public class Main {
    public static void main(String[] args) {
        VehiculFabrica fabrica=new MotocicletaFabrica();
        Vehicul motocicleta=fabrica.fabricaVehicul("PH 23 TFG", "Volvo");
        motocicleta.livreazaPachet();
    }
}
