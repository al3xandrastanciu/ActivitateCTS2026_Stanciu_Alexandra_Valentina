package chain.clase;

public class CalatorieTroleibuz extends CalatorieSuccesor {

    @Override
    public void setCalatorieHandler(CalatorieSuccesor calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    public CalatorieTroleibuz() {
        super();
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if(distanta<3){
            return "Troleibuz";
        }

        return super.calatorieHandler.recomandareCalatorie(distanta);



    }
}
