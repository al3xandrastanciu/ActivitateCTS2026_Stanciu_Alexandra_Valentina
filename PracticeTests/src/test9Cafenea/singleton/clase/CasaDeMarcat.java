package test9Cafenea.singleton.clase;

import test9Cafenea.factoryMethod.clase.IBautura;

import java.util.List;

public class CasaDeMarcat implements ComandaManager{
    protected List<IBautura> listaComanda;
    private static CasaDeMarcat instanta=null;

    private CasaDeMarcat(List<IBautura> listaComanda) {
        this.listaComanda = listaComanda;
    }


    @Override
    public void afisareComanda() {
        StringBuilder sb=new StringBuilder();
        sb.append("Lista comenzii: ").append(this.listaComanda);
        System.out.println(sb.toString());
    }

    @Override
    public void adaugaBautura(IBautura bautura) {
        listaComanda.add(bautura);
        System.out.println("Adaugat: "+bautura.getDetalii());
    }

    @Override
    public double calculeazaPret() {
        double pret=0;
        for(IBautura b:listaComanda){
            pret+=b.getPret();
        }
        return pret;
    }
    public static synchronized CasaDeMarcat getInstanta(List<IBautura> listaComanda){
        if(instanta==null){
            instanta=new CasaDeMarcat(listaComanda);
        }
        return instanta;
    }

}
