package test7Magazin.factoryMethod.clase;

public class Tableta implements Dispozitiv{
    private String model;
    private double pret;

    public Tableta(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    @Override
    public void afiseazaSpecificatii() {
        StringBuilder sb=new StringBuilder();
        sb.append("Tableta: ").append(this.model).append(", pret: ").append(this.pret);
        System.out.println(sb.toString());
    }
}
