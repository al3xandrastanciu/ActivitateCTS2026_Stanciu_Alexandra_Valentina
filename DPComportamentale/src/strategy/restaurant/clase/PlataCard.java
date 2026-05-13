package strategy.restaurant.clase;

public class PlataCard implements ModalitateDePlata{
    @Override
    public void plateste(String numeClient, double Suma) {
        System.out.println("Clientul "+numeClient+" a platit cu cardul suma "+Suma);
    }
}
