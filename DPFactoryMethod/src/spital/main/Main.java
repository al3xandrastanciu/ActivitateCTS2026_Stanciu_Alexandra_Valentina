package spital.main;

import spital.clase.Personal;
import spital.fabrici.*;

public class Main {
    public static void main(String[] args) {
        PersonalFabrica fabrica=new PersonalMedicalFabrica();
        Personal medic=fabrica.getpersonal(TipPersonalMedical.MEDIC, 5, "Maria Popescu", 3);
        medic.afiseazaPersonal();
        Personal asistent=fabrica.getpersonal(TipPersonalMedical.ASISTENT, 123, "Ion Marinescu", 1);
        asistent.afiseazaPersonal();

        PersonalFabrica fabrica1=new PersonalNonMedicalFabrica();
        Personal secretar=fabrica1.getPersonal(TipPersonalNonMedical.SECRETAR, 3, "Ioana Voicu");
        secretar.afiseazaPersonal();
    }
}
