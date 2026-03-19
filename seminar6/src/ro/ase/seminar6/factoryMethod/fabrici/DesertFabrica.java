package ro.ase.seminar6.factoryMethod.fabrici;

import ro.ase.seminar6.factoryMethod.clase.FelDeMancare;
import ro.ase.seminar6.factoryMethod.clase.Papanasi;

public class DesertFabrica implements FelDeMancareFabrica{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        return this.getFelDeMancare(tipFelDeMancare, gramaj, denumire, 500);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, float calorii) {
        switch (tipFelDeMancare){
            case TipDesert.PAPANASI : return new Papanasi(gramaj, denumire, calorii);
            case TipDesert.CLATITE: return new Papanasi(gramaj, denumire, calorii);
            default:return null;
        }
    }
}
