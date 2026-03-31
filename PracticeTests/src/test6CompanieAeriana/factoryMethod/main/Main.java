package test6CompanieAeriana.factoryMethod.main;

import test6CompanieAeriana.factoryMethod.clase.IAvion;
import test6CompanieAeriana.factoryMethod.factory.AvionFactory;
import test6CompanieAeriana.factoryMethod.factory.CargoFactory;
import test6CompanieAeriana.factoryMethod.factory.PasageriFactory;

public class Main {
    public static void main(String[] args) {
        AvionFactory factory=new CargoFactory();
        IAvion cargo=factory.creareAvion();
        cargo.zboara();
        AvionFactory factory1=new PasageriFactory();
        IAvion pasageri=factory1.creareAvion();
        pasageri.zboara();
    }
}
