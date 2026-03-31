package test1Service.singleton.clase;

import test1Service.AMasina;

public class Service implements IService{
    protected AMasina masinaCurenta;
    private static Service instanta=null;

    private Service() {}

    public void setMasinaCurenta(AMasina masinaCurenta) {
        this.masinaCurenta = masinaCurenta;
    }
    public static synchronized Service getInstanta(){
        if(instanta==null){
            instanta=new Service();
        }
        return instanta;
    }

    @Override
    public void primesteMasina(AMasina masina) {
        if(this.masinaCurenta==null) {
            this.masinaCurenta = masina;
            System.out.println("Service ul a primit masina " + this.masinaCurenta);
        }
    }
}
