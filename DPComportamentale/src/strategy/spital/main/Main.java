package strategy.spital.main;

import strategy.spital.clase.Cash;
import strategy.spital.clase.ModalitateDePlata;
import strategy.spital.clase.Pacient;

public class Main {
    static void main(String[] args) {
        Pacient pacient=new Pacient("Ana");
        pacient.plateste(500);
        ModalitateDePlata cash=new Cash();
        pacient.setModalitateDePlata(cash);
        pacient.plateste(200);
    }
}
