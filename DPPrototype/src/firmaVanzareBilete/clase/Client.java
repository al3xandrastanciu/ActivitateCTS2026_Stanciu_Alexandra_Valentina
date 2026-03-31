package firmaVanzareBilete.clase;

import java.util.List;

public class Client implements IClient{
    private String nume;
    private List<String> detalii;

    public Client() {
    }

    public Client(String nume, List<String> detalii) {
        this.nume = nume;
        this.detalii = detalii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDetalii(List<String> detalii) {
        this.detalii = detalii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", detalii=").append(detalii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IClient copiaza() {
        Client client=new Client();
        client.setNume(this.nume);
        client.setDetalii(this.detalii);
        return client;
    }
}
