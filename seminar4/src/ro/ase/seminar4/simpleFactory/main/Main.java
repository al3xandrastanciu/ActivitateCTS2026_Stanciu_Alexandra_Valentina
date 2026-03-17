package ro.ase.seminar4.simpleFactory.main;

import ro.ase.seminar4.simpleFactory.clase.factory.FactoryTransport;
import ro.ase.seminar4.simpleFactory.clase.factory.TipTransport;
import ro.ase.seminar4.simpleFactory.clase.mijlocDeTransport.Autobuz;
import ro.ase.seminar4.simpleFactory.clase.mijlocDeTransport.MijlocDeTransport;
import ro.ase.seminar4.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
        FactoryTransport factoryTransport=new FactoryTransport();
        MijlocDeTransport autobuz=factoryTransport.getMijlocDeTransport(TipTransport.AUTOBUZ, "MAN", 102);
        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai=factoryTransport.getMijlocDeTransport(TipTransport.TRAMVAI, "AAA", 105);
        tramvai.afiseazaTipTransport();

    }
}
