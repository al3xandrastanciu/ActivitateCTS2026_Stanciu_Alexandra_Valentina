package banca.main;

import banca.clase.Cont;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> documente=new HashMap<>();
        documente.put("Buletin", true);
        documente.put("Card de credit", false);
        Cont cont=new Cont("Ion Popescu", documente);
        System.out.println(cont);
        Cont cont1=(Cont) cont.copiaza();
        System.out.println(cont1);

    }
}
