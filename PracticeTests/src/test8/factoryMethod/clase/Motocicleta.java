package test8.factoryMethod.clase;

public class Motocicleta implements Vehicul{
    private String nrInmatriculare;
    private String model;

    public Motocicleta(String nrInmatriculare, String model) {
        this.nrInmatriculare = nrInmatriculare;
        this.model = model;
    }

    @Override
    public void livreazaPachet() {
        StringBuilder sb=new StringBuilder();
        sb.append("Motocicleta cu nr de inmatriculare ").append(this.nrInmatriculare).append(" si modelul ").append(this.model).append(" livreaza pachetul.");
        System.out.println(sb.toString());
    }
}
