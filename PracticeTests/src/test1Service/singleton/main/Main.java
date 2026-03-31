package test1Service.singleton.main;

import test1Service.AMasina;
import test1Service.singleton.clase.MasinaMica;
import test1Service.singleton.clase.Service;

public class Main {
    public static void main(String[] args) {
        MasinaMica masinaMica=new MasinaMica("PH 73 SVA", "Skoda fabia");
        MasinaMica masinaMica1=new MasinaMica("B 123 FMI", "Polo");
        Service service=Service.getInstanta();
        service.primesteMasina(masinaMica);
        Service service1=Service.getInstanta();
        service1.primesteMasina(masinaMica1);

    }
}