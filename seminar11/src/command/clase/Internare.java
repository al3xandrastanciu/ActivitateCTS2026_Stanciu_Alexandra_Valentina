package command.clase;

public class Internare implements Command{
    private PersonalSpital personalSpital;
    private Pacient pacient;

    public Internare(PersonalSpital personalSpital, Pacient pacient) {
        this.personalSpital = personalSpital;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        personalSpital.preluarePacient(pacient);
    }
}
