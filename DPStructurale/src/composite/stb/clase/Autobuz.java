package composite.stb.clase;

public class Autobuz implements Flota{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare+"Producator: "+this.producator+" , Model: "+this.model+" , nr locuri: "+this.nrLocuri);
    }


}
