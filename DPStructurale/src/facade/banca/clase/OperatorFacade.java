package facade.banca.clase;

public class OperatorFacade {
    private Operator operator;

    public OperatorFacade(Operator operator) {
        this.operator = operator;
    }
    public void verificaClient(){
        System.out.println("Se verifica clientul");
        operator.verificaCazier();
        operator.verificaCreante();
        operator.verificaVarsta();
    }
}
