package facade.restaurant.main;

import facade.restaurant.facade.RestaurantFacade;

public class Main {
    static void main(String[] args) {
        RestaurantFacade facade=new RestaurantFacade();
        System.out.println(facade.verificaDisponibilitate(1));
        System.out.println(facade.verificaDisponibilitate(5));
        System.out.println(facade.verificaDisponibilitate(12));
    }
}
