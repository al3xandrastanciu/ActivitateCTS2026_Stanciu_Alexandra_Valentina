package flyweight.stb.clase;

public class Autobuz implements IAutobuz{
    private String model;
    private int anFabricate;
    private int nrLocuri;
    private String nrInmatriculare;

    public Autobuz(String model, int anFabricate, int nrLocuri, String nrInmatriculare) {
        this.model = model;
        this.anFabricate = anFabricate;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare=nrInmatriculare;
    }

    @Override
    public void arataLinie(Linie linie) {
        System.out.println("Autobuzul "+this.nrInmatriculare+" merge pe linia "+linie);
    }
}
