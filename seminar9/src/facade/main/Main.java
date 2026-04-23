package facade.main;

import adapter.aplicatieFarmacie.MedicamentFarmacie;
import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;
import facade.facade.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient= new Pacient("Ion Popescu", 7);
        Medic medic=new Medic("Ana");
        Salon salon=new Salon();

        if(pacient.getGravitate()>=5){
            if(medic.areBiletdeTrimitere(pacient)){
                int nrPat=salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" a fost internat in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                }
            }
        }

        SpitalFacade facade=new SpitalFacade(new Medic("Marius"), new Salon());
        Pacient pacient1=new Pacient("Maria", 3);
        Pacient pacient2=new Pacient("Andrei", 8);

        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient);
    }
}
