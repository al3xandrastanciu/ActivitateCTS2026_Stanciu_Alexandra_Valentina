package test10Sala.prorotype.clase;

public class Client {
    private int inaltime;
    private double greutate;

    public Client(int inaltime, double greutate) {
        this.inaltime = inaltime;
        this.greutate = greutate;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("inaltime=").append(inaltime);
        sb.append(", greutate=").append(greutate);
        sb.append('}');
        return sb.toString();
    }
}
