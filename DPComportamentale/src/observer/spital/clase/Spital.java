package observer.spital.clase;

import strategy.spital.clase.Pacient;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<IPacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti=new ArrayList<>();
    }

    @Override
    public void abonarePacient(IPacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IPacient p:pacienti){
            p.primesteNotificare(mesaj+"de la spitalul "+this.nume);
        }
    }

    @Override
    public void dezabonarePacient(IPacient pacient) {
        pacienti.remove(pacient);
    }

    public void notificaEpidemie(){
        trimiteNotificare("Exista o epidemie");
    }
    public void notificaVirus(){
        trimiteNotificare("Exista un virus");
    }
}
