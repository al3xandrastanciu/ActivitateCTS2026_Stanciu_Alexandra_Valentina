package test2Service.simpleFactory.clase;

public class Portbagaj implements IComponenta{
    private String culoare;
    private double greutate;

    public Portbagaj(String culoare, double greutate) {
        this.culoare = culoare;
        this.greutate = greutate;
    }

    @Override
    public void afisareComponenta() {
        StringBuilder sb=new StringBuilder();
        sb.append("Culoare portbagaj: ").append(this.culoare).append(", greutate: ").append(this.greutate);
        System.out.println(sb.toString());
    }
}
