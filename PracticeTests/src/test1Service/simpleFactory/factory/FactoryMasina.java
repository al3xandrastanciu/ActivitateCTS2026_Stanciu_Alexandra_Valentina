package test1Service.simpleFactory.factory;

import test1Service.AMasina;
import test1Service.simpleFactory.clase.SEDAN;
import test1Service.simpleFactory.clase.SUV;
import test1Service.simpleFactory.clase.VAN;

public class FactoryMasina {
    public AMasina getMasina(TipMasina tipMasina, String nrInmatriculare, String model){
        switch (tipMasina){
            case TipMasina.SUV -> {return new SUV(nrInmatriculare,model);
            }
            case TipMasina.VAN -> {return new VAN(nrInmatriculare, model);
            }
            case TipMasina.SEDAN -> {return new SEDAN(nrInmatriculare, model);
            }
            default -> {return null;}
        }
    }
}
