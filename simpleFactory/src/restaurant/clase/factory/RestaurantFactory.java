package restaurant.clase.factory;

import restaurant.clase.supe.FelDeSupa;
import restaurant.clase.supe.SupaCiuperci;
import restaurant.clase.supe.SupaLegume;
import restaurant.clase.supe.SupaVita;

public class RestaurantFactory {
    public FelDeSupa getFelDeSupa(Tipsupa tip, float pret, float gramaj){
        switch (tip){
            case Tipsupa.SUPA_DE_LEGUME -> {
                return new SupaLegume(pret,gramaj);
            }
            case Tipsupa.SUPA_DE_CIUPERCI -> {
                return new SupaCiuperci(pret,gramaj);
            }
            case Tipsupa.SUPA_DE_VITA -> {
                return new SupaVita(pret, gramaj);
            }
            default -> {
                return null;
            }
        }
    }
}
