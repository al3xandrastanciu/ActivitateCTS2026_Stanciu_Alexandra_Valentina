package adapter.stb.main;

import adapter.stb.transoprtTerestru.SoftTerestru;
import adapter.stb.transportMetrou.AdapterMetrou;
import adapter.stb.transportMetrou.SoftMetrou;

public class Main {
    public static void valideaza(SoftMetrou softMetrou){
        softMetrou.valideazaAbonamentMetrou();
        softMetrou.valideazaBiletMetrou();
    }

    static void main(String[] args) {
        SoftTerestru softTerestru=new SoftTerestru();
        SoftMetrou softMetrou=new SoftMetrou();

        softMetrou.valideazaBiletMetrou();
        softTerestru.valideazaAbonament();
        AdapterMetrou adapterMetrou=new AdapterMetrou(softTerestru);
        valideaza(adapterMetrou);
    }
}
