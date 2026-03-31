package test3Vehicule.factoryMethod.clase;

public class Trotineta implements Vehicul{
    private int id;
    private String culoare;

    public Trotineta(int id, String culoare) {
        this.id = id;
        this.culoare = culoare;
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Trotineta cu id-ul ").append(this.id).append(" are culoarea ").append(this.culoare);
        System.out.println(sb.toString());
    }
}
