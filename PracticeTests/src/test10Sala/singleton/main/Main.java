package test10Sala.singleton.main;

import test10Sala.singleton.clase.SistemAcces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> membrii=new ArrayList<String>();
        membrii.add("Ioana popescu");
        membrii.add("Maria Ionescu");
        SistemAcces instanta=SistemAcces.getInstanta(membrii);
        System.out.println(instanta);

        instanta.inregistreazaIntrare("Andreea");
        SistemAcces instanta2=SistemAcces.getInstanta(membrii);
        System.out.println(instanta2);
        instanta2.inregistreazaIntrare("Mihai");
        System.out.println(instanta2);
    }
}
