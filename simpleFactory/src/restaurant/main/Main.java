package restaurant.main;

import restaurant.clase.factory.RestaurantFactory;
import restaurant.clase.factory.Tipsupa;
import restaurant.clase.supe.FelDeSupa;

public class Main {
    public static void main(String[] args) {
        RestaurantFactory factory=new RestaurantFactory();
        FelDeSupa supaDeLegume=factory.getFelDeSupa(Tipsupa.SUPA_DE_LEGUME, 25, 300);
        supaDeLegume.afisareSupa();
        FelDeSupa supaDeCiuperci= factory.getFelDeSupa(Tipsupa.SUPA_DE_CIUPERCI, 30, 350);
        supaDeCiuperci.afisareSupa();
    }
}
