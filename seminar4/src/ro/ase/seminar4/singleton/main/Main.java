package ro.ase.seminar4.singleton.main;

import ro.ase.seminar4.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger instanta=Logger.getInstanta("Interfata", "afisare");
        instanta.afiseazaLog("Fisierul JSON nu e afisat corect");
        instanta.afiseazaLog("Eroare");
        Logger instanta2=Logger.getInstanta("Backend", "baza de date");
        instanta2.afiseazaLog("e1roare");
        instanta2.setCategorie("baza de date");
        instanta2.setSender("backend");
        instanta2.afiseazaLog("eroare la inserare");

    }
}