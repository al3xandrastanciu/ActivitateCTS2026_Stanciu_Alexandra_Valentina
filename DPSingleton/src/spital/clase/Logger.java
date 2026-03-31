package spital.clase;

public class Logger {
    protected int idNotificare;
    protected String mesajAfisat;

    private static Logger instanta=null;

    private Logger( String mesajAfisat) {
        this.idNotificare = 0;
        this.mesajAfisat = mesajAfisat;
    }

    public void setIdNotificare(int idNotificare) {
        this.idNotificare = idNotificare;
    }

    public void setMesajAfisat(String mesajAfisat) {
        this.mesajAfisat = mesajAfisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Logger{");
        sb.append("idNotificare=").append(idNotificare);
        sb.append(", mesajAfisat='").append(mesajAfisat).append('\'');
        sb.append('}');
        idNotificare++;
        return sb.toString();
    }
    public static synchronized Logger getInstance(String mesajAfisat){
        if(instanta==null){
            instanta=new Logger( mesajAfisat);
        }
        return instanta;
    }
}
