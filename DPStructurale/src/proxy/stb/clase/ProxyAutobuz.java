package proxy.stb.clase;

public class ProxyAutobuz implements IAutobuz{
    private Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(int nrCalatori) {
        if(nrCalatori>0){
            autobuz.opresteInStatie(nrCalatori);

        }else{
            System.out.println("Autobuzul nu va opri");
        }
    }
}
