package flyweight.banca.clase;

public class Detinator implements IDetinator{
    private String nume;
    private String adresa;

    public Detinator(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public void retineInfoCont(Banca banca) {
        System.out.println("Clientul "+this.nume+" are cont la banca "+banca);
    }
}
