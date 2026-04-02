package test10Sala.prorotype.main;

import test10Sala.prorotype.clase.Client;
import test10Sala.prorotype.clase.IPlanAlimentar;
import test10Sala.prorotype.clase.PlanAlimentar;

public class Main {
    public static void main(String[] args) {
        Client client=new Client(170, 65);
        IPlanAlimentar planAlimentar=new PlanAlimentar(client);
        IPlanAlimentar planAlimentar1=(PlanAlimentar) planAlimentar.copiaza();
        System.out.println(planAlimentar);
        System.out.println(planAlimentar1);

    }
}
