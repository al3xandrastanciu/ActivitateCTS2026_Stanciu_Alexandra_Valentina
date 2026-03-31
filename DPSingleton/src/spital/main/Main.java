package spital.main;

import spital.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger instanta=Logger.getInstance("semne vitale bune");
        System.out.println(instanta);
        Logger instanta2=Logger.getInstance("semne vitale scazute");
        System.out.println(instanta2);
    }
}
