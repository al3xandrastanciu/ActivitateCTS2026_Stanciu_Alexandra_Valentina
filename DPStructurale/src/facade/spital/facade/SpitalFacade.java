package facade.spital.facade;

import facade.spital.clase.Medic;
import facade.spital.clase.Pacient;
import facade.spital.clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if (pacient.getGravitate() >= 5) {
            if (medic.verificaPacient(pacient)) {
                int nrPat = salon.suntPaturiLibere();
                if (salon.suntPaturiLibere() != -1) {
                    System.out.println("Pacientul " + pacient.getNume() + " a fost internat in patul " + nrPat);
                    salon.ocupaPat(nrPat);
                } else {
                    System.out.println("Nu exista paturi disponibile");
                }
            } else {
                System.out.println("Pacientul " + pacient.getNume() + " nu are trimitere");
            }
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu are nevoie de internare");
        }
    }
}
