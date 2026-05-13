package chainOfResponsability.restaurant.clase;

public class Mail extends NotificareHandler{
    public Mail() {
        super();
    }

    @Override
    public void setNotificareHandler(NotificareHandler notificareHandler) {
        super.setNotificareHandler(notificareHandler);
    }

    @Override
    public String recomandareNotificare(Client client, String mesaj) {
        if(client.getMail()!=null){
            System.out.println("Notificare mail: "+mesaj);
        }
        return super.notificareHandler.recomandareNotificare(client,mesaj);
    }
}
