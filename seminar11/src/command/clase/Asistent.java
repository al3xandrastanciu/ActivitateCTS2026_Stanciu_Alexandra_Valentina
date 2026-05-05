package command.clase;



public class Asistent implements PersonalSpital{
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.printf("Asistentul "+this.nume+" trateaza pacientul "+pacient.getNume());
    }
}
