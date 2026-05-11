package proxy.spital.proxy;

import proxy.spital.clase.ISpital;
import proxy.spital.clase.Pacient;
import proxy.spital.clase.Spital;

public class Proxy implements ISpital {
    private Spital spital;

    public Proxy(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if(pacient.isAsigurare()){
            spital.interneaza(pacient);
        }else {
            System.out.println("Pacientul "+pacient.getNume()+" nu poate fi internat");
        }
    }
}
