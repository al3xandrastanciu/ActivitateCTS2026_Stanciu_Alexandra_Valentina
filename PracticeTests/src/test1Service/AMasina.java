package test1Service;

public abstract class AMasina {
    protected String nrInmatriculare;
    protected String model;

    public AMasina(String nrInmatriculare, String model) {
        this.nrInmatriculare = nrInmatriculare;
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
