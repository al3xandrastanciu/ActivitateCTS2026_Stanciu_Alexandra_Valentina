package facade.banca.main;

import facade.banca.clase.Operator;
import facade.banca.clase.OperatorFacade;

public class Main {
    static void main(String[] args) {
        Operator operator=new Operator();
        OperatorFacade operatorFacade=new OperatorFacade(operator);
        operatorFacade.verificaClient();
    }
}
