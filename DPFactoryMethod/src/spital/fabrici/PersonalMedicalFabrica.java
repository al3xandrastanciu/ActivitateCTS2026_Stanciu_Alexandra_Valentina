package spital.fabrici;

import spital.clase.Asistent;
import spital.clase.Brancardier;
import spital.clase.Medic;
import spital.clase.Personal;

public class PersonalMedicalFabrica implements PersonalFabrica{
    @Override
    public Personal getpersonal(TipPersonal tipPersonal, int id, String nume, int schimb) {
        switch (tipPersonal){
            case TipPersonalMedical.BRANCARDIER -> {return new Brancardier(id, nume, schimb);
            }
            case TipPersonalMedical.ASISTENT -> {return new Asistent(id, nume, schimb);
            }
            case TipPersonalMedical.MEDIC -> {return new Medic(id, nume, schimb);
            }
            default -> {return null;}
        }
    }

    @Override
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume) {
        return this.getpersonal(tipPersonal,id, nume, 2);
    }
}
