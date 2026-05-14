package facade.stb.main;

import facade.stb.UsaFacade;
import facade.stb.clase.UsaFata;
import facade.stb.clase.UsaMijloc;
import facade.stb.clase.UsaSpate;

public class Main {
    static void main(String[] args) {
        UsaSpate usaSpate=new UsaSpate();
        UsaFata usaFata=new UsaFata();
        UsaMijloc usaMijloc=new UsaMijloc();
        UsaFacade usaFacade=new UsaFacade(usaFata,usaMijloc,usaSpate);
        usaFacade.deschideForatat();
        usaFacade.deschiderUsi();
    }
}
