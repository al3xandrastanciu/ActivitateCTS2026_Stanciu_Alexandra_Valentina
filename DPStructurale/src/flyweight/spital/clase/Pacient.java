package flyweight.spital.clase;

public class Pacient implements IPacient{
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void arataDetaliiInternare(Salon salon) {
        System.out.println("Pacientul "+this.nume+" este internat in salonul "+salon);
    }
}
