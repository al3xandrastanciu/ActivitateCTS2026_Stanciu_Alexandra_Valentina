package ro.ase.seminar4.simpleFactory.clase.factory;

import ro.ase.seminar4.simpleFactory.clase.mijlocDeTransport.*;

public class FactoryTransport {

    public MijlocDeTransport getMijlocDeTransport(TipTransport tip, String marca, Integer nrLinie){
        switch(tip){
            case TipTransport.AUTOBUZ -> {
                return new Autobuz(nrLinie,marca);
            }
            case TipTransport.TRAMVAI -> {
                return new Tramvai(nrLinie,marca);
            }
            case TipTransport.TROLEIBUZ -> {
                return new Troleibuz(nrLinie,marca);
            }
            default -> {
                return null;
            }
        }

    }
}
