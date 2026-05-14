package flyweight.banca.clase;

public class Banca {
    private String nume;
    private String sucursala;

    public Banca(String nume, String sucursala) {
        this.nume = nume;
        this.sucursala = sucursala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
