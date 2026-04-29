package proxy.main;

import proxy.ProxyCuAsigurare;
import proxy.clase.Pacient;
import proxy.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Ana", true);
        Spital spital=new Spital("municipal");
        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy=new ProxyCuAsigurare(spital);
        Pacient pacient1=new Pacient("Ion", false);
        proxy.interneazaPacient(pacient1);

    }
}
