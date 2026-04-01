package test7Magazin.factoryMethod.clase;

public class Smartphone implements Dispozitiv{
    private String model;
    private double pret;

    public Smartphone(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    @Override
    public void afiseazaSpecificatii() {
        StringBuilder sb=new StringBuilder();
        sb.append("Smartphone: ").append(this.model).append(", pret: ").append(this.pret);
        System.out.println(sb.toString());
    }
}
