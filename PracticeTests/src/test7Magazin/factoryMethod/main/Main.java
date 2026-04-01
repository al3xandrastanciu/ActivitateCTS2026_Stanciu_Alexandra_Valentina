package test7Magazin.factoryMethod.main;

import test7Magazin.factoryMethod.clase.Dispozitiv;
import test7Magazin.factoryMethod.fabrici.DispozitivFabrica;
import test7Magazin.factoryMethod.fabrici.LaptopFabrica;
import test7Magazin.factoryMethod.fabrici.SmartphoneFabrica;

public class Main {
    public static void main(String[] args) {
        DispozitivFabrica fabrica=new LaptopFabrica();
        Dispozitiv laptop=fabrica.getDispozitiv("Lenovo", 2455.8);
        laptop.afiseazaSpecificatii();
        DispozitivFabrica fabrica1=new SmartphoneFabrica();
        Dispozitiv smartphone=fabrica1.getDispozitiv("Iphone", 5000d);
        smartphone.afiseazaSpecificatii();
    }
}
