package test10Sala.singleton.clase;

import java.util.List;

public class SistemAcces implements IGestiuneAcces{
    private List<String> numeMembrii;
    private static SistemAcces instanta=null;

    private SistemAcces(List<String> numeMembrii) {
        this.numeMembrii = numeMembrii;
    }

    @Override
    public void inregistreazaIntrare(String numeMembru) {
        numeMembrii.add(numeMembru);
        System.out.println("Am inregistrat membrul: "+numeMembru);
    }

    @Override
    public int getNumarPersoanePrezente() {
        return numeMembrii.size();
    }

    @Override
    public void afiseazaLoguri() {
        System.out.println("s-au inregistrat membrii: "+numeMembrii);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SistemAcces{");
        sb.append("numeMembrii=").append(numeMembrii);
        sb.append('}');
        return sb.toString();
    }
    public static synchronized SistemAcces getInstanta(List<String> numeMembrii){
        if(instanta==null){
            instanta=new SistemAcces(numeMembrii);
        }
        return instanta;
    }


}
