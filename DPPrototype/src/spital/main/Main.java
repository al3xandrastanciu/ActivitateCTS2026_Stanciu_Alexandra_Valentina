package spital.main;

import spital.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> cantitatiParacetamol=new HashMap<>();
        cantitatiParacetamol.put("Apa", 4.3);
        cantitatiParacetamol.put("Substanta activa", 3.9);
        Reteta reteta=new Reteta("Paracetamol",cantitatiParacetamol );
        System.out.println(reteta);
        Reteta reteta1=(Reteta)  reteta.copiaza();
        reteta1.setMedicament("Ibuprofen");
        System.out.println(reteta1);
    }
}