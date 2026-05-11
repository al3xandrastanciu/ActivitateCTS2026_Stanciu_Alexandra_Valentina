package adapter.stb.transportMetrou;

import adapter.stb.transoprtTerestru.SoftTerestru;

public class AdapterMetrou extends SoftMetrou {
    private SoftTerestru softTerestru;

    public AdapterMetrou(SoftTerestru softTerestru) {
        this.softTerestru = softTerestru;
    }

    @Override
    public void valideazaBiletMetrou() {
        softTerestru.valideazaBilet();
    }

    @Override
    public void valideazaAbonamentMetrou() {
       softTerestru.valideazaAbonament();
    }
}
