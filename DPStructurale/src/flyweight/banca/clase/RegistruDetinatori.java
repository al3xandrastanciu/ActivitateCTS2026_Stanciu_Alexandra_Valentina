package flyweight.banca.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruDetinatori {
    private Map<String, IDetinator> detinatori=new HashMap<>();
    public IDetinator getDetinator(String nume, String adresa){
        IDetinator detinator=detinatori.get(adresa);
        if(detinator==null){
            detinator=new Detinator(nume, adresa);
            detinatori.put(adresa, detinator);
        }
        return detinator;
    }
}
