package test2Service.prototype.clase;

public class Sticker implements ISticker{
    private String modelMasina;
    private int anFabricatie;
    private double lungime;
    private double latime;

    public Sticker() {
    }

    public Sticker(String modelMasina, int anFabricatie) {
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
        if(anFabricatie >2010) {
            this.lungime = 130.7;
            this.latime = 200;
        }else{
            this.lungime = 122.5;
            this.latime = 180.5;
        }
    }

    public void setModelMasina(String modelMasina) {
        this.modelMasina = modelMasina;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("modelMasina='").append(modelMasina).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", lungime=").append(lungime);
        sb.append(", latime=").append(latime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ISticker copiaza() {
        Sticker sticker=new Sticker();
        sticker.setModelMasina(this.modelMasina);
        sticker.setAnFabricatie(this.anFabricatie);
        sticker.setLungime(this.lungime);
        sticker.setLatime(this.latime);
        return sticker;
    }
}
