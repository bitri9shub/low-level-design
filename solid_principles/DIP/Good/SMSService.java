package solid_principles.DIP.Good;

public class SMSService implements INotificationChannel {
    @Override
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}
