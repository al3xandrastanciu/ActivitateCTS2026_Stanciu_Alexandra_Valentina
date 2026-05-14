package facade.stb.clase;

public class UsaSpate implements Usa{
    @Override
    public void deschidereLiber() {
        System.out.println("usa din spate a fost deschisa");
    }

    @Override
    public void deschideFortat() {
        System.out.println("usa din spate a fost deschisa fortat");
    }
}
