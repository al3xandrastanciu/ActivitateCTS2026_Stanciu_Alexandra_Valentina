package facade.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    private List<Integer> meseLibera;

    public Receptionist() {
        this.meseLibera=new ArrayList<>();
        for(int i=0;i<10;i++){
            meseLibera.add(i+1);
        }
    }
    public boolean verificaMasa(int nrMasa){
        return meseLibera.contains(nrMasa);
    }

}
