package proxy.banca.clase;

public class Main {
    static void main(String[] args) {
        Banca banca=new Banca("RON");
        Banca banca1=new Banca("EUR");
        ProxyBanca proxyBanca=new ProxyBanca(banca);
        proxyBanca.realizeazaCredit();
        ProxyBanca proxyBanca1=new ProxyBanca(banca1);
        proxyBanca1.realizeazaCredit();
    }
}
