package adapter.banca.clase.softVechi;

public class Adapterleasing extends FrameworkLeasing{
    public Framework frameworkVechi;

    public Adapterleasing(Framework frameworkVechi) {
        this.frameworkVechi = frameworkVechi;
    }

    @Override
    public void oferaCreditleasing(String date) {
        frameworkVechi.oferaCredit(date);
    }
}
