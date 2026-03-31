package test3Vehicule.factoryMethod.clase;

public class Bicicleta implements Vehicul{
    private int id;
    private String culoare;

    public Bicicleta(int id, String culoare) {
        this.id = id;
        this.culoare = culoare;
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Bicicleta cu id-ul ").append(this.id).append(" are culoarea ").append(this.culoare);
        System.out.println(sb.toString());
    }
}
