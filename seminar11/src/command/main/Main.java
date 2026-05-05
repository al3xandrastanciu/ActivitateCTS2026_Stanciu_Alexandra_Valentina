package command.main;

import command.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic=new Medic("Popescu Maria");
        PersonalSpital asistent=new Asistent("IOnescu Marian");

        Pacient pacient=new Pacient("Ionica");
        Pacient pacient1=new Pacient("Gigel");

        Command comanda=new Internare(medic, pacient);
        comanda.executa();

        Command commanda1=new Tratare(asistent, pacient1);
        commanda1.executa();
    }
}
