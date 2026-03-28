package stb.clase;

public class AutobuzLinie {
    protected String model;
    protected String numeSofer;
    protected boolean opriri;
    protected boolean deschideUsi;
    protected String textafisat;

    public AutobuzLinie(String model, String numeSofer, boolean opriri, boolean deschideUsi, String textafisat) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.opriri = opriri;
        this.deschideUsi = deschideUsi;
        this.textafisat = textafisat;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setOpriri(boolean opriri) {
        this.opriri = opriri;
    }

    public void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    public void setTextafisat(String textafisat) {
        this.textafisat = textafisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", opriri=").append(opriri);
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", textafisat='").append(textafisat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
