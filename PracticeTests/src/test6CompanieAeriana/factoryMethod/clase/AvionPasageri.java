package test6CompanieAeriana.factoryMethod.clase;

public class AvionPasageri implements IAvion {


    public AvionPasageri() {}

    @Override
    public void zboara() {
        StringBuilder sb=new StringBuilder();
        sb.append("Avionul cu pasageri zboara");
        System.out.println(sb.toString());
    }
}
