package chainOfResponsability.stb.main;

import chainOfResponsability.stb.clase.CalatorieAutobuz;
import chainOfResponsability.stb.clase.CalatorieHandler;
import chainOfResponsability.stb.clase.CalatorieTroleibuz;

public class Main {
    static void main(String[] args) {
        CalatorieHandler troleibuz=new CalatorieTroleibuz();
        CalatorieHandler aut=new CalatorieAutobuz();
        troleibuz.setCalatorieHandler(aut);
        System.out.println(troleibuz.recomandareCalatorie(4));
    }
}
