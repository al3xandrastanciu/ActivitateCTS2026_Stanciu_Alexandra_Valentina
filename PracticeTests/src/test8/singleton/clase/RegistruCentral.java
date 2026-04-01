package test8.singleton.clase;

public class RegistruCentral {
    private String nume;
    private static RegistruCentral instanta=null;

    private RegistruCentral(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegistruCentral{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static synchronized RegistruCentral getInstanta(String nume){
        if(instanta==null){
            instanta=new RegistruCentral(nume);
        }
        return instanta;
    }
}
