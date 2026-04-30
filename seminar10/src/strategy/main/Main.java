package strategy.main;

import strategy.clase.Client;
import strategy.clase.ModalitateDePlata;
import strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Marin");
        client.plateste(500);
        ModalitateDePlata plataCash=new PlataCash();
        client.setModalitateDePlata(plataCash);
        client.plateste(200);
    }
}
