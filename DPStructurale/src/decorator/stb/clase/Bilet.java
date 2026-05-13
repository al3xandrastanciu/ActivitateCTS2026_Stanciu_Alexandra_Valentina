package decorator.stb.clase;

public class Bilet implements IBilet{
    private String destinatia;

    public Bilet(String destinatia) {
        this.destinatia = destinatia;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("S a printat biletul cu destinatia: "+this.destinatia);
    }
}
