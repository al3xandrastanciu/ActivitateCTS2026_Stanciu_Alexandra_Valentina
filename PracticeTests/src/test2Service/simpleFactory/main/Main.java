package test2Service.simpleFactory.main;

import test2Service.simpleFactory.clase.IComponenta;
import test2Service.simpleFactory.factory.ComponentaFactory;
import test2Service.simpleFactory.factory.TipComponenta;

public class Main {
    public static void main(String[] args) {
        ComponentaFactory factory=new ComponentaFactory();
        IComponenta usa=factory.getComponenta(TipComponenta.USA, "negru", 8);
       usa.afisareComponenta();
        IComponenta usa2=factory.getComponenta(TipComponenta.USA, "rosu", 12);
        usa2.afisareComponenta();
        IComponenta bara=factory.getComponenta(TipComponenta.BARA, "verde", 5);
        bara.afisareComponenta();
        IComponenta bara2=factory.getComponenta(TipComponenta.BARA, "albastru", 4);
        bara2.afisareComponenta();
        IComponenta capota=factory.getComponenta(TipComponenta.CAPOTA, "negru", 10);
        capota.afisareComponenta();
    }
}
