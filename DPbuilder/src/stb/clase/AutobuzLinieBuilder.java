package stb.clase;

public class AutobuzLinieBuilder implements AutobuzLinieBuilderAbstract{
    private boolean opriri;
    private boolean deschideUsi;

    public AutobuzLinieBuilder() {
        this.opriri = false;
        this.deschideUsi = false;
    }

    public AutobuzLinieBuilder setOpriri(boolean opriri) {
        this.opriri = opriri;
        return this;
    }

    public AutobuzLinieBuilder setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }

    @Override
    public AutobuzLinie build(String model, String numeSofer, String textAfisat) {
        AutobuzLinie autobuzLinie=new AutobuzLinie(model, numeSofer, this.opriri, this.deschideUsi, textAfisat);
        return  autobuzLinie;
    }
}
