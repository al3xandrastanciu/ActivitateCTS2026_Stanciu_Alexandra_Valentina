package restaurant.clase;

public class CasaDeMarcat {
    protected double sumaIncasata;
    private static CasaDeMarcat instanta=null;

    private CasaDeMarcat(double sumaIncasata) {
        this.sumaIncasata = sumaIncasata;
    }

    public void setSumaIncasata(double sumaIncasata) {
        this.sumaIncasata = sumaIncasata;
    }

    public static synchronized CasaDeMarcat getInstance(double sumaIncasata){
        if(instanta==null){
            instanta=new CasaDeMarcat(sumaIncasata);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CasaDeMarcat{");
        sb.append("sumaIncasata=").append(sumaIncasata);
        sb.append('}');
        return sb.toString();
    }
}
