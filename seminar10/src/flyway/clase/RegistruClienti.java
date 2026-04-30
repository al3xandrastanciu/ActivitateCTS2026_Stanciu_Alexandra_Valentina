package flyway.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String, ClientAbstract> clienti= new HashMap<>();

    public ClientAbstract getClient(String nume, String nrTelefon, String email){
        ClientAbstract client=clienti.get(nrTelefon);
        if(client==null){
            client=new Client(nume, nrTelefon, email);
            clienti.put(nrTelefon, client);
        }
        return client;
    }
}
