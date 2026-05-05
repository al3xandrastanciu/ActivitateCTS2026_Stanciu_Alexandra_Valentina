package observer.clase;

public class PacientAbonat implements Pacient{
    private String nume;
    private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String notificare) {
        System.out.printf("Pacientul "+this.nume+" a primit mesajul "+notificare);
    }
}
