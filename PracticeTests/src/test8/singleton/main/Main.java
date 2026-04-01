package test8.singleton.main;

import test8.singleton.clase.RegistruCentral;

public class Main {
    public static void main(String[] args) {
        RegistruCentral instanta=RegistruCentral.getInstanta("Registru 1");
        System.out.println(instanta);
        RegistruCentral instanta2=RegistruCentral.getInstanta("Registru2");
        System.out.println(instanta2);
    }
}
