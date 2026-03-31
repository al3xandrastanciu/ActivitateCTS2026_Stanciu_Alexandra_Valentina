package stb.clase;

import java.util.List;

public class Autobuz implements IAutobuz{
    private String model;
    private List<String> setari;

    public Autobuz() {
    }

    public Autobuz(String model, List<String> setari) {
        this.model = model;
        this.setari = setari;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSetari(List<String> setari) {
        this.setari = setari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", setari=").append(setari);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IAutobuz copiaza() {
        Autobuz autobuz=new Autobuz();
        autobuz.setModel(this.model);
        autobuz.setSetari(this.setari);
        return autobuz;
    }
}
