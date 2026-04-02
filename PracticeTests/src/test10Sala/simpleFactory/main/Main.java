package test10Sala.simpleFactory.main;

import test10Sala.simpleFactory.clase.IAbonament;
import test10Sala.simpleFactory.fabrici.AbonamentFabrica;
import test10Sala.simpleFactory.fabrici.TipAbonament;

public class Main {
    public static void main(String[] args) {
        AbonamentFabrica fabrica=new AbonamentFabrica();
        IAbonament yoga=fabrica.getabonament(TipAbonament.YOGA,"Ioana", 23, 140);
        System.out.println(yoga.getDetalii());
        System.out.println(yoga.getPret());
    }
}
