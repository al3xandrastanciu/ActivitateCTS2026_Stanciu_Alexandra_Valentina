package flyway.clase;

public class Client implements ClientAbstract{
    private String nume;
    private String numarTelefon;
    private String mail;

    public Client(String nume, String numarTelefon, String mail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.mail = mail;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" are rezervarea "+rezervare);
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println("Clientul "+this.nume+ " plateste suma de "+ taxaPerPersoana * rezervare.getNrPersoane());
    }


}
