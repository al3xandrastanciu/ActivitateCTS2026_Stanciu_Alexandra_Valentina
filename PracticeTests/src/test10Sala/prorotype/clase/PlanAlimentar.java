package test10Sala.prorotype.clase;

public class PlanAlimentar implements IPlanAlimentar{
    private Client client;

    public PlanAlimentar() {
    }

    public PlanAlimentar(Client client) {
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public IPlanAlimentar copiaza() {
        PlanAlimentar planAlimentar=new PlanAlimentar();
        planAlimentar.setClient(this.client);
        return planAlimentar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanAlimentar{");
        sb.append("client=").append(client);
        sb.append('}');
        return sb.toString();
    }
}
