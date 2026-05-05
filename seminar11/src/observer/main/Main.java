package observer.main;

import observer.clase.ISpital;
import observer.clase.Pacient;
import observer.clase.PacientAbonat;
import observer.clase.Spital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new PacientAbonat("Ana", 23);
        Pacient pacient1=new PacientAbonat("Andrei", 40);




        ISpital spital=new Spital("Municipal");
        spital.aboneazaPacient(pacient);
        spital.aboneazaPacient(pacient1);

        ((Spital) spital).notificareEpidemie();
        ((Spital) spital).notificaVirus();

    }
}