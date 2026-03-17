package ro.ase.seminar5.builder.main;

import ro.ase.seminar5.builder.clase.Internare;
import ro.ase.seminar5.builder.clase.InternareBuilder;
import ro.ase.seminar5.builder.clase.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare=new Internare(true, false, true, true, "Ion");
        Internare internare2=new Internare(false, false, false, false, "Mihai");

        InternareBuilder builder=new InternareBuilder("Gigel");
        Internare internare3= builder.build();
        Internare internare4=builder.setPatRabatabil(true).setPapuci(true).sethalat(true).setNumePacient("Ionel").build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builder2=new InternareBuilderAlternativ().setMicDejun(true);
        Internare internare101= builder2.build("Ana");
        Internare internare102=builder2.build("Ionela");
        System.out.println(internare101);
        System.out.println(internare102);
    }
}