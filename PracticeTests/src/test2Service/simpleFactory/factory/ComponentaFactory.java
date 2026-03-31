package test2Service.simpleFactory.factory;

import test2Service.simpleFactory.clase.*;

public class ComponentaFactory {
    public IComponenta getComponenta(TipComponenta tipComponenta, String culoare, double greutate){
        switch (tipComponenta){
            case TipComponenta.USA -> {return new Usa(culoare, greutate);
            }
            case TipComponenta.CAPOTA -> {return new Capota(culoare, greutate);
            }
            case TipComponenta.BARA -> {return new Bara(culoare, greutate);
            }
            case TipComponenta.PORTBAGAJ -> {return new Portbagaj(culoare,greutate);
            }
            default -> {return null;}
        }
    }
}
