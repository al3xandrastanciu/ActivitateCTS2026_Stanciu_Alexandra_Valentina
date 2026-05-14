package proxy.banca.clase;

public class Banca implements IBanca{
    public String moneda;

    public Banca(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public void realizeazaCredit() {
        System.out.println("Banca realizeaza credite in "+this.moneda);
    }
}
