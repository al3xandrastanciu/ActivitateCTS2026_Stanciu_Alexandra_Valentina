package test7Magazin.factoryMethod.clase;

public class Laptop implements Dispozitiv{
    private String model;
    private double pret;

    public Laptop(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    @Override
    public void afiseazaSpecificatii() {
        StringBuilder sb=new StringBuilder();
        sb.append("Laptop: ").append(this.model).append(", pret: ").append(this.pret);
        System.out.println(sb.toString());
    }
}
