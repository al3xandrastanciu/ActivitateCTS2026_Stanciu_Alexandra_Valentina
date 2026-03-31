package test5Spital.singleton.main;

import test5Spital.singleton.clase.ConfiguratieSpital;

public class Main {
    public static void main(String[] args) {
        ConfiguratieSpital instanta=ConfiguratieSpital.getInstanta("http://localhost:8080", 21);
        System.out.println(instanta);
        ConfiguratieSpital instanta2=ConfiguratieSpital.getInstanta("http://localhost:3000", 17);
        System.out.println(instanta2);
    }
}
