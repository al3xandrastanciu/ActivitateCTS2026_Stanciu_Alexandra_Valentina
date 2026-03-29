package companieAeriana.clase;

public class BiletAvionBuilder implements IBiletAvion{
    private boolean mancare;
    private boolean bagajCala;
    private boolean loclaFereastra;

    public BiletAvionBuilder() {
        this.mancare = false;
        this.bagajCala = false;
        this.loclaFereastra = false;
    }

    public BiletAvionBuilder setMancare(boolean mancare) {
        this.mancare = mancare;
        return this;
    }

    public BiletAvionBuilder setBagajCala(boolean bagajCala) {
        this.bagajCala = bagajCala;
        return this;
    }

    public BiletAvionBuilder setLoclaFereastra(boolean loclaFereastra) {
        this.loclaFereastra = loclaFereastra;
        return this;
    }

    @Override
    public BiletAvion build(String numePasager, String nrLoc) {
        BiletAvion biletAvion=new BiletAvion(numePasager,nrLoc,this.mancare, this.bagajCala, this.loclaFereastra);
        return biletAvion;
    }
}
