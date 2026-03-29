package banca.fabrici;

import banca.clase.Client;

public interface TipClientFactory {
    public Client getClient(String nume);
}
