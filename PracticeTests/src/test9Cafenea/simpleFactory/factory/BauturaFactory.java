package test9Cafenea.simpleFactory.factory;

import test9Cafenea.factoryMethod.clase.Cafea;
import test9Cafenea.factoryMethod.clase.Ceai;
import test9Cafenea.factoryMethod.clase.Ciocolata;
import test9Cafenea.factoryMethod.clase.IBautura;

public class BauturaFactory {
    public IBautura getBautura(TipBautura tipBautura, String nume, double volum, double pret){
        switch (tipBautura){
            case TipBautura.CAFEA -> {return new Cafea(nume, volum, pret);
            }
            case TipBautura.CEAI -> {return new Ceai(nume, volum, pret);
            }
            case TipBautura.CIOCOLATA_CALDA -> {return new Ciocolata(nume, volum, pret);
            }
            default -> {return null;}
        }
    }
}
