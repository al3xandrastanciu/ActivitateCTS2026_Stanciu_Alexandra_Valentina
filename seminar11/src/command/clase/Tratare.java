package command.clase;

public class Tratare implements Command{
    private PersonalSpital personalSpital;
    private Pacient pacient;

    public Tratare(PersonalSpital personalSpital, Pacient pacient) {
        this.personalSpital = personalSpital;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        personalSpital.preluarePacient(pacient);
    }
}
