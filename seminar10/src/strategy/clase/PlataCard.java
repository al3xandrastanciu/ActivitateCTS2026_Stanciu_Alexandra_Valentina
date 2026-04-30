package strategy.clase;

public class PlataCard implements ModalitateDePlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+numeClient+" a platit suma cu cardul "+suma);
    }
}
