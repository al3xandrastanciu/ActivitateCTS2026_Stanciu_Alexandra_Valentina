package proxy.spital.clase;

public class Spital implements ISpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" este internat in spitalul "+this.nume);
    }
}
