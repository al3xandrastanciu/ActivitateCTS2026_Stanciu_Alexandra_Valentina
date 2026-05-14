package facade.stb.clase;

public class UsaFata implements Usa{
    @Override
    public void deschidereLiber() {
        System.out.println("usa din fata a fost deschisa");
    }

    @Override
    public void deschideFortat() {
        System.out.println("usa din fata a fost deschisa fortat");
    }
}
