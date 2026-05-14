package facade.restaurant.facade;

import facade.restaurant.clase.Chelner;
import facade.restaurant.clase.Receptionist;

public class RestaurantFacade {
    public String verificaDisponibilitate(int nrMasa) {
        Receptionist receptionist = new Receptionist();
        if (receptionist.verificaMasa(nrMasa)){
            Chelner chelner=new Chelner();
            if(chelner.esteMasaCurata(nrMasa)){
                if (chelner.areServetel(nrMasa)){
                    return "Masa este gata";
                }else {
                    return "Are nevoie de servetele";
                }
            }else {
                return "Nu e debarasata";
            }
        }else{
            return "Nu e libera";
        }
    }
}

