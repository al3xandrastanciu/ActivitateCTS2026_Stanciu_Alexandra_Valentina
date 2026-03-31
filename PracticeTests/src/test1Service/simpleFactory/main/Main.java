package test1Service.simpleFactory.main;

import test1Service.AMasina;
import test1Service.simpleFactory.factory.FactoryMasina;
import test1Service.simpleFactory.factory.TipMasina;

public class Main {
    public static void main(String[] args) {
        FactoryMasina factoryMasina=new FactoryMasina();
        AMasina suv=factoryMasina.getMasina(TipMasina.SUV, "B 111 SUV", "Range Rover");
        System.out.println(suv);
        AMasina van=factoryMasina.getMasina(TipMasina.VAN, "PH 12 HYD", "Opel");
        System.out.println(van);
    }
}
