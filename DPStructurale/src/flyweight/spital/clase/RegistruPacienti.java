package flyweight.spital.clase;


import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {
    private Map<String, IPacient> pacienti=new HashMap<>();
    public IPacient getPacient(String nume, String telefon, String adresa){
        IPacient pacient=pacienti.get(telefon);
        if(pacient==null){
            pacient=new Pacient(nume, telefon, adresa);
            pacienti.put(telefon, pacient);
        }
        return pacient;
    }
}
