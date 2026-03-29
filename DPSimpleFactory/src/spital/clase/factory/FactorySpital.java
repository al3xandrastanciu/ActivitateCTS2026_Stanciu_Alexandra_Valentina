package spital.clase.factory;

import spital.clase.personal.Asistent;
import spital.clase.personal.Brancardier;
import spital.clase.personal.Medic;
import spital.clase.personal.PersonalSpital;

public class FactorySpital {
    public PersonalSpital getPersonalspital(TipPersonal tip, String nume, float salariu, int vechime){
        switch (tip){
            case TipPersonal.BRANCARDIER -> {
                return new Brancardier(nume,salariu,vechime);
            }
            case TipPersonal.ASISTENT -> {
                return new Asistent(nume,salariu,vechime);
            }
            case TipPersonal.MEDIC -> {
                return new Medic(nume,salariu,vechime);
            }
            default -> {
                return null;
            }
        }
    }
}
