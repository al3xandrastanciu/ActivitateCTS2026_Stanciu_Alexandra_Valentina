package banca.main;

import banca.clase.Client;
import banca.clase.PersoanaFizica;
import banca.fabrici.PersoanaFizicaFabrica;
import banca.fabrici.PersoanaJuridicaFactory;
import banca.fabrici.TipClientFactory;

public class Main {
    public static void main(String[] args) {
        TipClientFactory factory=new PersoanaFizicaFabrica();
        Client fizica=factory.getClient("Ana");
        fizica.afiseaza();
    }
}
