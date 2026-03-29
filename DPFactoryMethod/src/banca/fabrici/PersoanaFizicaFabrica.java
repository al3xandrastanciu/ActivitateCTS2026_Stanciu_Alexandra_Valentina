package banca.fabrici;

import banca.clase.Client;
import banca.clase.PersoanaFizica;

public class PersoanaFizicaFabrica implements TipClientFactory{

    @Override
    public Client getClient(String nume) {
        return new PersoanaFizica(nume);
    }
}
