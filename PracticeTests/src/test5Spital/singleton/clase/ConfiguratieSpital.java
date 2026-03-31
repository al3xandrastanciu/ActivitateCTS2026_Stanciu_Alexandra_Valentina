package test5Spital.singleton.clase;

public class ConfiguratieSpital {
    protected String adresaServer;
    protected int versiuneAplicatie;
    private static ConfiguratieSpital instanta=null;

    private ConfiguratieSpital(String adresaServer, int versiuneAplicatie) {
        this.adresaServer = adresaServer;
        this.versiuneAplicatie = versiuneAplicatie;
    }

    public void setAdresaServer(String adresaServer) {
        this.adresaServer = adresaServer;
    }

    public void setVersiuneAplicatie(int versiuneAplicatie) {
        this.versiuneAplicatie = versiuneAplicatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfiguratieSpital{");
        sb.append("adresaServer='").append(adresaServer).append('\'');
        sb.append(", versiuneAplicatie=").append(versiuneAplicatie);
        sb.append('}');
        return sb.toString();
    }
    public static synchronized ConfiguratieSpital getInstanta(String adresaServer, int versiuneAplicatie){
        if(instanta==null){
            instanta=new ConfiguratieSpital(adresaServer, versiuneAplicatie);
        }
        return instanta;
    }
}
