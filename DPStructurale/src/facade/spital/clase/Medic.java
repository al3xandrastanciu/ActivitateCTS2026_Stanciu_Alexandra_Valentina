package facade.spital.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }
    public boolean verificaPacient(Pacient pacient){
        if(pacient.getGravitate()>6){
            return true;
        }
        return false;
    }
}
