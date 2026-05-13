package proxy.stb.main;

import proxy.stb.clase.Autobuz;
import proxy.stb.clase.ProxyAutobuz;

public class Main {
    static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        ProxyAutobuz proxyAutobuz=new ProxyAutobuz(autobuz);
        proxyAutobuz.opresteInStatie(2);

        ProxyAutobuz proxyAutobuz1=new ProxyAutobuz(autobuz);
        proxyAutobuz1.opresteInStatie(0);
    }

}
