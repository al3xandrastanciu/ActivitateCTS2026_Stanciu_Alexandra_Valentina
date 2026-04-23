package proxy;

import proxy.clase.ISpital;
import proxy.clase.Pacient;
import proxy.clase.Spital;

public class ProxyCuAsigurare implements ISpital {
    private Spital spital;

    public ProxyCuAsigurare(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAsigurare()){
            spital.interneazaPacient(pacient);
        }else{
            System.out.println("Pacientul "+pacient.getNume()+" nu poate fi internat");
        }
    }
}
