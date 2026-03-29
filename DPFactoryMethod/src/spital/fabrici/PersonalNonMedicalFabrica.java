package spital.fabrici;

import spital.clase.Personal;
import spital.clase.Registrator;
import spital.clase.Secretar;

public class PersonalNonMedicalFabrica implements PersonalFabrica{
    @Override
    public Personal getpersonal(TipPersonal tipPersonal, int id, String nume, int schimb) {
        return this.getPersonal(tipPersonal, id, nume);
    }

    @Override
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume) {
        switch (tipPersonal){
            case TipPersonalNonMedical.SECRETAR -> {return new Secretar(id, nume);
            }
            case TipPersonalNonMedical.REGISTRATOR -> {return new Registrator(id, nume);
            }
            default -> {return null;}
        }
    }
}
