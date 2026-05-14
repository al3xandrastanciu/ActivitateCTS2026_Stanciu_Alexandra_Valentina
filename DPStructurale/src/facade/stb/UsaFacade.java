package facade.stb;

import facade.stb.clase.UsaFata;
import facade.stb.clase.UsaMijloc;
import facade.stb.clase.UsaSpate;

public class UsaFacade {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public UsaFacade(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }
    public void deschiderUsi(){
        System.out.println("se deschid usile");
        usaFata.deschidereLiber();
        usaMijloc.deschidereLiber();
        usaSpate.deschidereLiber();
    }
    public void deschideForatat(){
        System.out.println("Deschide fortat");
        usaSpate.deschideFortat();
        usaMijloc.deschideFortat();
        usaFata.deschideFortat();
    }
}
