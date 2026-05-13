package strategy.spital.clase;

public class Card implements ModalitateDePlata{
    @Override
    public void plateste(String numePacient, double Suma) {
        System.out.println("Pacientul "+numePacient+" a platit cu cardul suma de "+Suma);
    }
}
