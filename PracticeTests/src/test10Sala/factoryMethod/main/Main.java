package test10Sala.factoryMethod.main;

import test10Sala.factoryMethod.clase.IEchipament;
import test10Sala.factoryMethod.fabrici.EchipamentFabrica;
import test10Sala.factoryMethod.fabrici.EchipamentGreutatiFabrica;

public class Main {
    public static void main(String[] args) {
        EchipamentFabrica fabrica=new EchipamentGreutatiFabrica();
        IEchipament greutati=fabrica.getEchipament("Gantere");
        greutati.verificaStare();
    }
}
