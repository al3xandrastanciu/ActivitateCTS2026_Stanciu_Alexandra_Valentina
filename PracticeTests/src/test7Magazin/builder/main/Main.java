package test7Magazin.builder.main;

import test7Magazin.builder.clase.PachetLivrare;
import test7Magazin.builder.clase.PachetLivrareBuilder;

public class Main {
    public static void main(String[] args) {
        PachetLivrareBuilder builder=new PachetLivrareBuilder();
        PachetLivrare pachetLivrare=builder.setLivrareUrgenta(true).setMesajPersonalizat("La multi ani!").setImpachetarecadou(true).build("452283vxh8290");
        System.out.println(pachetLivrare);
    }
}
