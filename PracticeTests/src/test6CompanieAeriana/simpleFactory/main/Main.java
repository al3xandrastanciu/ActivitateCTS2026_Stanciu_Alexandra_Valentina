package test6CompanieAeriana.simpleFactory.main;

import test6CompanieAeriana.simpleFactory.clase.Personal;
import test6CompanieAeriana.simpleFactory.factory.Personalfactory;
import test6CompanieAeriana.simpleFactory.factory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        Personalfactory personalfactory=new Personalfactory();
        Personal pilot= personalfactory.getPersonal(TipPersonal.PILOT, "Popescu Mihai", 15000);
        pilot.afiseazaPersonal();
        Personal stewardesa= personalfactory.getPersonal(TipPersonal.STEWARDESA,"Ionescu Maria", 9000.6);
        stewardesa.afiseazaPersonal();
    }
}
