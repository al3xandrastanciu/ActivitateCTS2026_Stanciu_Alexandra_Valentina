package strategy.restaurant.clase;

public class PlataCash implements ModalitateDePlata{
    @Override
    public void plateste(String numeClient, double Suma) {
        System.out.println("Clientul "+numeClient+" a platit cash suma "+Suma);
    }
}
