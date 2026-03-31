package test5Spital.prototype.clase;

import java.util.Map;

public class Reteta implements IReteta{
    private Map<String, Double> listaMedicamente;

    public Reteta(Map<String, Double> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }
    public Reteta() {

    }

    public void setListaMedicamente(Map<String, Double> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IReteta copiaza() {
        Reteta reteta=new Reteta();
        reteta.setListaMedicamente(this.listaMedicamente);
        return reteta;
    }
}
