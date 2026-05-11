package facade.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Chelner {
    private List<Boolean> meseDebarasate;
    private List<Boolean> meseCuServetel;

    public Chelner() {
        this.meseDebarasate=new ArrayList<>();
        this.meseCuServetel=new ArrayList<>();

        for(int i=0;i<16;i++){
            if(i>6){
                meseDebarasate.add(true);
            }else {
                meseDebarasate.add(false);
            }
        }
        for(int i=0;i<16;i++){
            if(i>6){
                meseCuServetel.add(true);
            }else {
                meseCuServetel.add(false);
            }
        }
    }

    public boolean esteMasaCurata(int nrMasa){
        return meseDebarasate.get(nrMasa);
    }
    public boolean areServetel(int nrMasa){
     return   meseCuServetel.get(nrMasa);
    }
}
