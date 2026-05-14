package proxy.banca.clase;

public class ProxyBanca implements IBanca{
    private Banca banca;

    public ProxyBanca(Banca banca) {
        this.banca = banca;
    }

    @Override
    public void realizeazaCredit() {
        if(banca.getMoneda()=="RON"){
            banca.realizeazaCredit();
        }else {
            System.out.println("Nu se poate realiza credit");
        }
    }
}
