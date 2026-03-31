package test2Service.simpleFactory.clase;

public class Usa implements IComponenta{
    private String culoare;
    private double greutate;

    public Usa(String culoare, double greutate) {
        this.culoare = culoare;
        this.greutate = greutate;
    }

    @Override
    public void afisareComponenta() {
        StringBuilder sb=new StringBuilder();
        sb.append("Culoare usa: ").append(this.culoare).append(", greutate: ").append(this.greutate);
        System.out.println(sb.toString());
    }
}
