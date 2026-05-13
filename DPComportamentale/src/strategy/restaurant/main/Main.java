package strategy.restaurant.main;

import strategy.restaurant.clase.Client;
import strategy.restaurant.clase.ModalitateDePlata;
import strategy.restaurant.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Client client=new Client("Ana");
        client.plateste(300);
        ModalitateDePlata platacash=new PlataCash();
        client.setModalitateDePlata(platacash);
        client.plateste(200);
    }
}