package strategy.spital.clase;

import strategy.spital.clase.ModalitateDePlata;

public class Cash implements ModalitateDePlata {

    @Override
    public void plateste(String numePacient, double Suma) {
        System.out.println("Pacientul "+numePacient+" a platit cash suma de "+Suma);
    }
}
