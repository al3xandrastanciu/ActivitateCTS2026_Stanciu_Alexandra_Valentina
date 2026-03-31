package test1Service.simpleFactory.clase;

import test1Service.AMasina;

public class SEDAN extends AMasina {

    public SEDAN(String nrInmatriculare, String model) {
        super(nrInmatriculare, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SEDAN{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
