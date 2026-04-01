package test9Cafenea.prorotype.clase;

import test9Cafenea.factoryMethod.clase.IBautura;

public class BauturaPresetata implements IBauturaPresetata {
    private IBautura bautura;

    public BauturaPresetata() {
    }

    public BauturaPresetata(IBautura bautura) {
        this.bautura = bautura;
    }

    public void setBautura(IBautura bautura) {
        this.bautura = bautura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("bautura=").append(bautura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IBauturaPresetata copiaza() {
        BauturaPresetata bauturaPresetata=new BauturaPresetata();
        bauturaPresetata.setBautura(this.bautura);
        return bauturaPresetata;
    }


}
