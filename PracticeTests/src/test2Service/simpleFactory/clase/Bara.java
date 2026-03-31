package test2Service.simpleFactory.clase;

public class Bara implements IComponenta{
    private String culoare;
    private double greutate;

    public Bara(String culoare, double greutate) {
        this.culoare = culoare;
        this.greutate = greutate;
    }

    @Override
    public void afisareComponenta() {
        StringBuilder sb=new StringBuilder();
        sb.append("Culoare bara: ").append(this.culoare).append(", greutate: ").append(this.greutate);
        System.out.println(sb.toString());
    }
}
