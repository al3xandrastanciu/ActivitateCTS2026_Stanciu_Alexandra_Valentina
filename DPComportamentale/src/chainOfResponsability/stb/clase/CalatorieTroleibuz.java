package chainOfResponsability.stb.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    public CalatorieTroleibuz() {
        super();
    }

    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if(distanta<3){
            return "Troleibuz";
        }
        return super.calatorieHandler.recomandareCalatorie(distanta);
    }
}
