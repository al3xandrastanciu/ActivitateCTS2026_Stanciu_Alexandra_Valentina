package test9Cafenea.singleton.main;

import test9Cafenea.factoryMethod.clase.IBautura;
import test9Cafenea.simpleFactory.factory.BauturaFactory;
import test9Cafenea.simpleFactory.factory.TipBautura;
import test9Cafenea.singleton.clase.CasaDeMarcat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory=new BauturaFactory();
        IBautura cafea=factory.getBautura(TipBautura.CAFEA, "neagra", 200d, 15d);
        IBautura ceai=factory.getBautura(TipBautura.CEAI, "negru", 300d, 15d);


        IBautura ciocolata=factory.getBautura(TipBautura.CIOCOLATA_CALDA, "neagra", 300d, 20d);

        List<IBautura> listaComenzi = new ArrayList<>();
        listaComenzi.add(cafea);
        listaComenzi.add(ceai);

        CasaDeMarcat casaMarcat = CasaDeMarcat.getInstanta(listaComenzi);
        System.out.println(casaMarcat.calculeazaPret());
       casaMarcat.afisareComanda();

    }
}
