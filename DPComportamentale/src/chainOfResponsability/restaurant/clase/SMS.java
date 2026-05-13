package chainOfResponsability.restaurant.clase;

public class SMS extends NotificareHandler{
    public SMS() {
        super();
    }

    @Override
    public void setNotificareHandler(NotificareHandler notificareHandler) {
        super.setNotificareHandler(notificareHandler);
    }

    @Override
    public String recomandareNotificare(Client client, String mesaj) {
        if(client.getTel()!=null){
            System.out.println("Notificare SMS: "+mesaj);
        }
        return super.notificareHandler.recomandareNotificare(client,mesaj);
    }
}
