package firmaVanzareBilete.main;

import firmaVanzareBilete.clase.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> detalii=new ArrayList<String>();
        detalii.add("client premium");
        detalii.add("are reducere");
        Client client=new Client("Maria", detalii);
        System.out.println(client);
        Client client1=(Client) client.copiaza();
        client1.setNume("Ioana");
        System.out.println(client1);
    }
}
