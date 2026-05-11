package adapter.restaurant.softBar;

import adapter.restaurant.softBucatarie.SoftBucatarie;

public class AdaptorBar extends SoftBar{
    SoftBucatarie softVechi;

    public AdaptorBar(SoftBucatarie softVechi) {
        this.softVechi = softVechi;
    }

    @Override
    public void printeazaNota(String dateNota) {
        softVechi.printeazaFacturaBucatarie(dateNota);
    }
}
