package test10Sala.builder.main;

import test10Sala.builder.clase.MembruPremium;
import test10Sala.builder.clase.MembruPremiumBuilder;

public class Main {
    public static void main(String[] args) {
        MembruPremiumBuilder builder=new MembruPremiumBuilder();
        MembruPremium membruPremium=builder.setAccesPiscina(true).build("Ioana", 13);
        System.out.println(membruPremium);
        MembruPremium membruPremium1=builder.setAntrenor(true).setAccesPiscina(false).build("Ana", 20);
        System.out.println(membruPremium1);
    }
}
