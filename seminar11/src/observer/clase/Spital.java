package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Pacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for (Pacient p:pacienti){
            p.receptioneazaNotificare(notificare+ "de la spitalul "+this.nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        pacienti.remove(pacient);
    }

    public void notificaVirus(){
        trimiteNotificare("A aparut un virus nou in oras");
    }

    public void notificareEpidemie(){
        trimiteNotificare("A aparut o epidemie in oras");
    }
}
