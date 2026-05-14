package facade.stb.clase;

public class UsaMijloc implements Usa{
    @Override
    public void deschidereLiber() {
        System.out.println("usa din mijloc a fost deschisa");
    }

    @Override
    public void deschideFortat() {
        System.out.println("usa din mijloc a fost deschisa fortat");
    }
}
