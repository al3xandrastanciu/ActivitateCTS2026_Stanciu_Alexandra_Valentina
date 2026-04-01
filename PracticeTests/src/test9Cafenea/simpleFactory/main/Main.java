package test9Cafenea.simpleFactory.main;

import test9Cafenea.factoryMethod.clase.IBautura;
import test9Cafenea.simpleFactory.factory.BauturaFactory;
import test9Cafenea.simpleFactory.factory.TipBautura;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory=new BauturaFactory();
        IBautura cafea=factory.getBautura(TipBautura.CAFEA, "capucino", 300d, 15.5);
        cafea.preparare();
        System.out.println(cafea.getDetalii());
        System.out.println(cafea.getPret());
        IBautura ciocolata=factory.getBautura(TipBautura.CIOCOLATA_CALDA, "alba", 400d, 17.5);
        ciocolata.preparare();
        System.out.println(ciocolata.getPret());
        System.out.println(ciocolata.getDetalii());
    }
}
