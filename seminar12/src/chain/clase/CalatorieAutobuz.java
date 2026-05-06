package chain.clase;

public class CalatorieAutobuz extends CalatorieSuccesor {
    @Override
    public void setCalatorieHandler(CalatorieSuccesor calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    public CalatorieAutobuz() {
        super();
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if(distanta>3 && distanta<5){
            return "Autobuz";
        }

        return super.calatorieHandler.recomandareCalatorie(distanta);

    }
}
