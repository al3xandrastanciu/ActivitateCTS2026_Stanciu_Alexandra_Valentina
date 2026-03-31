package test6CompanieAeriana.simpleFactory.factory;

import test6CompanieAeriana.simpleFactory.clase.Copilot;
import test6CompanieAeriana.simpleFactory.clase.Personal;
import test6CompanieAeriana.simpleFactory.clase.Pilot;
import test6CompanieAeriana.simpleFactory.clase.Stewardesa;

public class Personalfactory {
    public Personal getPersonal(TipPersonal tipPersonal, String nume, double salariu){
        switch (tipPersonal){
            case TipPersonal.PILOT -> {return new Pilot(nume, salariu);
            }
            case TipPersonal.COPILOT -> {return new Copilot(nume, salariu);
            }
            case TipPersonal.STEWARDESA -> {return new Stewardesa(nume, salariu);
            }
            default -> {return null;}
        }
    }
}
