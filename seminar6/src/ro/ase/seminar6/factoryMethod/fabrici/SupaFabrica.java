package ro.ase.seminar6.factoryMethod.fabrici;

import ro.ase.seminar6.factoryMethod.clase.Ciorba;
import ro.ase.seminar6.factoryMethod.clase.FelDeMancare;
import ro.ase.seminar6.factoryMethod.clase.Supa;
import ro.ase.seminar6.factoryMethod.clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica{


    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        switch (tipFelDeMancare){
            case TipSupa.SUPA_CREMA : return new SupaCrema(gramaj, denumire);
            case TipSupa.CIORBA : return new Ciorba(gramaj, denumire);
            default : return null;
        }


    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, float calorii) {
        return this.getFelDeMancare(tipFelDeMancare, gramaj, denumire);
    }
}
