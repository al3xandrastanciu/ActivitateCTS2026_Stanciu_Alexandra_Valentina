package banca.fabrici;

import banca.clase.Client;
import banca.clase.PersoanaJuridica;

public class PersoanaJuridicaFactory implements TipClientFactory{
    @Override
    public Client getClient(String nume) {
        return new PersoanaJuridica(nume);
    }
}
