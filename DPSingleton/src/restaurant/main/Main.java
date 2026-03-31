package restaurant.main;

import restaurant.clase.CasaDeMarcat;

public class Main {
    public static void main(String[] args) {
        CasaDeMarcat instanta=CasaDeMarcat.getInstance(3600.7);
        System.out.println(instanta);
        CasaDeMarcat instanta2=CasaDeMarcat.getInstance(4566);
        System.out.println(instanta2);
    }
}