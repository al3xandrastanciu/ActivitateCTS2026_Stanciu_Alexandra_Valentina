package test9Cafenea.prorotype.main;

import test9Cafenea.factoryMethod.clase.IBautura;
import test9Cafenea.prorotype.clase.BauturaPresetata;
import test9Cafenea.simpleFactory.factory.BauturaFactory;
import test9Cafenea.simpleFactory.factory.TipBautura;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory=new BauturaFactory();
        IBautura cafea=factory.getBautura(TipBautura.CAFEA, "capucino", 300d, 15.5);
        BauturaPresetata bauturaPresetata=new BauturaPresetata(cafea);
        System.out.println(bauturaPresetata);
        BauturaPresetata bauturaPresetata1=(BauturaPresetata) bauturaPresetata.copiaza();
        System.out.println(bauturaPresetata1);
    }
}
