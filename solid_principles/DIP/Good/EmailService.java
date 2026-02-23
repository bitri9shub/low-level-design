package solid_principles.DIP.Good;

public class EmailService implements INotificationChannel {
    @Override
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}
