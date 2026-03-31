package test6CompanieAeriana.factoryMethod.clase;

public class AvionCargo implements IAvion{
    public AvionCargo() {
    }

    @Override
    public void zboara() {
        StringBuilder sb=new StringBuilder();
        sb.append("Avionul cargo zboara");
        System.out.println(sb.toString());
    }
}
