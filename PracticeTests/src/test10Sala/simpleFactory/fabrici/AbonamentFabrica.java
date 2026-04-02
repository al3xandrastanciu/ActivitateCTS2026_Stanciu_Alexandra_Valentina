package test10Sala.simpleFactory.fabrici;

import test10Sala.simpleFactory.clase.AbonamentCardio;
import test10Sala.simpleFactory.clase.AbonamentCrossfit;
import test10Sala.simpleFactory.clase.AbonamentYoga;
import test10Sala.simpleFactory.clase.IAbonament;

public class AbonamentFabrica {
    public IAbonament getabonament(TipAbonament tipAbonament, String nume, int perioada, int pret){
        switch (tipAbonament){
            case TipAbonament.YOGA -> {return new AbonamentYoga(nume, perioada, pret);
            }
            case TipAbonament.CARDIO -> {return new AbonamentCardio(nume, perioada, pret);
            }
            case TipAbonament.CROSSFIT -> {return new AbonamentCrossfit(nume, perioada, pret);
            }
            default -> {return null;}
        }
    }
}
