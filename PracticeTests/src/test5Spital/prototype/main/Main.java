package test5Spital.prototype.main;

import test5Spital.prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> listaMedicamente=new HashMap<>();
        listaMedicamente.put("Paracetamol", 12.5);
        listaMedicamente.put("Algocalmin", 20.0);
        listaMedicamente.put("Diclofenac", 30.6);
        Reteta reteta=new Reteta(listaMedicamente);
        System.out.println(reteta);
        Reteta reteta1=(Reteta) reteta.copiaza();
        System.out.println(reteta1);
    }
}
