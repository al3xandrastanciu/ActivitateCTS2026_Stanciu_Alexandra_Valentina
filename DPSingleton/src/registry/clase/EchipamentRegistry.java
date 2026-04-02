package registry.clase;

import java.util.HashMap;
import java.util.Map;

public class EchipamentRegistry {
    public static Map<String, IEchipament> colectie=new HashMap<>();

    private EchipamentRegistry() {
    }
    public static void register(String name, IEchipament value) throws Exception{
        if(colectie.containsKey(name))
            throw new Exception("Cheia "+name+" este deja inregistrata");
        else colectie.put(name, value);
    }
    public static IEchipament getEchipament(String name){
        return colectie.get(name);
    }
}
