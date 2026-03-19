package ro.ase.seminar6.factoryMethod.main;

import ro.ase.seminar6.factoryMethod.clase.FelDeMancare;
import ro.ase.seminar6.factoryMethod.clase.Supa;
import ro.ase.seminar6.factoryMethod.clase.SupaCrema;
import ro.ase.seminar6.factoryMethod.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema= fabrica.getFelDeMancare(TipSupa.SUPA_CREMA, 340, "supa crema de legume");
        FelDeMancare ciorba= fabrica.getFelDeMancare(TipSupa.CIORBA, 400, "ciorba de vacuta");

        FelDeMancareFabrica fabrica2=new DesertFabrica();
        FelDeMancare papanasi=fabrica2.getFelDeMancare(TipDesert.PAPANASI, 500, "cu dulceata", 800);
        FelDeMancare clatite=fabrica2.getFelDeMancare(TipDesert.CLATITE, 400, "cu nutella", 789);

       supaCrema.afiseaza();
       papanasi.afiseaza();
       ciorba.afiseaza();
       clatite.afiseaza();

    }
}