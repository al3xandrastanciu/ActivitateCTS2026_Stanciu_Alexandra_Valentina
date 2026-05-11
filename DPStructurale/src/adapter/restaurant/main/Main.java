package adapter.restaurant.main;

import adapter.restaurant.softBar.AdaptorBar;
import adapter.restaurant.softBar.SoftBar;
import adapter.restaurant.softBucatarie.SoftBucatarie;

public class Main {
    public static void printeaza(SoftBar softBar, String date){
        softBar.printeazaNota(date);
    }
    static void main() {
        SoftBar softBar=new SoftBar();
        SoftBucatarie softBucatarie=new SoftBucatarie();
        softBucatarie.printeazaFacturaBucatarie("alimente 1500");
        softBar.printeazaNota("140 ron");

        AdaptorBar adaptorBar=new AdaptorBar(softBucatarie);
        printeaza(adaptorBar, "300 ron");
    }
}
