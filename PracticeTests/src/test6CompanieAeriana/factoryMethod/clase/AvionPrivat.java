package test6CompanieAeriana.factoryMethod.clase;

public class AvionPrivat implements IAvion{
    public AvionPrivat() {
    }

    @Override
    public void zboara() {
        StringBuilder sb=new StringBuilder();
        sb.append("Avionul privat zboara");
        System.out.println(sb.toString());
    }
}
