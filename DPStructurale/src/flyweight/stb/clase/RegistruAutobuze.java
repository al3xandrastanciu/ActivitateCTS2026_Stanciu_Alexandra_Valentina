package flyweight.stb.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruAutobuze {
    private Map<String,IAutobuz > autobuze=new HashMap<>();
    public IAutobuz getAutobuz(String model, int an, int nrLocuri, String nrInmatriculare){
        IAutobuz autobuz=autobuze.get(nrInmatriculare);
        if(autobuz==null){
            autobuz=new Autobuz(model, an, nrLocuri, nrInmatriculare);
            autobuze.put(nrInmatriculare, autobuz);
        }
        return autobuz;
    }
}
