package solid_principles.DIP.Good;

public class Client {
    public static void main(String[] args) {
        NotificationService notifServ_1 = new NotificationService(new EmailService());
        NotificationService notifServ_2 = new NotificationService(new SMSService());
        notifServ_1.notify("Haa wahed notif");
        notifServ_2.notify("Haa notif akhra");
    }
}
