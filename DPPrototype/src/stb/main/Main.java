package stb.main;

import stb.clase.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> setari=new ArrayList<>();
        setari.add("usi automate");
        setari.add("acces persoane cu dizabilitati");
        Autobuz autobuz=new Autobuz("Mercedes", setari);
        System.out.println(autobuz);
        Autobuz autobuz1=(Autobuz) autobuz.copiaza();
        autobuz1.setModel("MAN");
        System.out.println(autobuz1);
    }
}
