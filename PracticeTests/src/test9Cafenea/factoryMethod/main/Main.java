package test9Cafenea.factoryMethod.main;

import test9Cafenea.factoryMethod.clase.IBautura;
import test9Cafenea.factoryMethod.fabrici.BauturaFabrica;
import test9Cafenea.factoryMethod.fabrici.CafeaFactory;
import test9Cafenea.factoryMethod.fabrici.CeaiFactory;

public class Main {
    public static void main(String[] args) {
        BauturaFabrica fabrica=new CeaiFactory();
        IBautura ceai=fabrica.getBautura("de fructe", 350.5, 15);
        ceai.preparare();
        System.out.println(ceai.getDetalii());
        System.out.println(ceai.getPret());

    }
}
