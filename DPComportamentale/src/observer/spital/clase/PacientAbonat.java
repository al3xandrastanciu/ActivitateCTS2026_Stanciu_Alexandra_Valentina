package observer.spital.clase;

public class PacientAbonat implements IPacient{
    private String nume;

    public PacientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul "+this.nume+" a primit notificarea: "+mesaj);
    }
}
