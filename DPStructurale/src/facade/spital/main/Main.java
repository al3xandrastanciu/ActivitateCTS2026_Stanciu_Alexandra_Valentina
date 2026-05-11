package facade.spital.main;

import facade.spital.clase.Medic;
import facade.spital.clase.Pacient;
import facade.spital.clase.Salon;
import facade.spital.facade.SpitalFacade;

public class Main {
    static void main(String[] args) {
        Pacient pacient=new Pacient("Ana", 7);
        Medic medic=new Medic("Ion");
        Salon salon=new Salon();

        SpitalFacade facade=new SpitalFacade(medic, salon);
        facade.interneazaPacient(pacient);
    }
}
