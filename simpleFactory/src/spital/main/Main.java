package spital.main;

import spital.clase.factory.FactorySpital;
import spital.clase.factory.TipPersonal;
import spital.clase.personal.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        FactorySpital factorySpital=new FactorySpital();
        PersonalSpital brancardier=factorySpital.getPersonalspital(TipPersonal.BRANCARDIER, "Ion Popescu", 3500, 12);
        brancardier.afiseazaPersonal();
        PersonalSpital medic=factorySpital.getPersonalspital(TipPersonal.MEDIC, "Ioana Mihai", 8000, 15);
        medic.afiseazaPersonal();
    }
}