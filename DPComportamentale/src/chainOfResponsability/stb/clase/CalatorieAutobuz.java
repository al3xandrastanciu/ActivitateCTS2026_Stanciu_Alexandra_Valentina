package chainOfResponsability.stb.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    public CalatorieAutobuz() {
        super();
    }

    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if(distanta<5){
            return "Autobuz";
        }
        return super.calatorieHandler.recomandareCalatorie(distanta);
    }

}
