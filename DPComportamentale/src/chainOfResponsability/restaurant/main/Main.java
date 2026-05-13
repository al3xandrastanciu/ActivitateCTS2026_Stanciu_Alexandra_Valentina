package chainOfResponsability.restaurant.main;

import chainOfResponsability.restaurant.clase.Client;
import chainOfResponsability.restaurant.clase.Mail;
import chainOfResponsability.restaurant.clase.NotificareHandler;
import chainOfResponsability.restaurant.clase.SMS;

public class Main {
    static void main(String[] args) {
        NotificareHandler sms=new SMS();
        NotificareHandler mail=new Mail();

        Client  client=new Client(null, "aa@mail.com");

//        mail.setNotificareHandler(sms);
//        System.out.println(sms.recomandareNotificare(client, "mesaj"));

    }
}
