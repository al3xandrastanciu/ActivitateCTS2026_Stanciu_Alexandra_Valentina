package observer.spital.main;

import observer.spital.clase.IPacient;
import observer.spital.clase.ISpital;
import observer.spital.clase.PacientAbonat;
import observer.spital.clase.Spital;

public class Main {
    static void main(String[] args) {
        IPacient pacient=new PacientAbonat("Ana");
        IPacient pacient1=new PacientAbonat("Marius");

        ISpital spital=new Spital("Municipal");
        spital.abonarePacient(pacient);
        spital.abonarePacient(pacient1);

        ((Spital)spital).notificaEpidemie();

    }
}
