package flyweight.restaurant.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String, IClient> registru=new HashMap<>();

    public IClient getClient(String nume, String telefon, String email){
        IClient client=registru.get(telefon);
        if(client==null){
            client=new Client(nume, telefon, email);
            registru.put(telefon,client);
        }
        return client;
    }
}
