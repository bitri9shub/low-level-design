package solid_principles.DIP.Good;

public class NotificationService {
    private INotificationChannel notificationChannel;

    public NotificationService (INotificationChannel notificationChannel){
        this.notificationChannel = notificationChannel;
    }

    public void notify(String msg){
        notificationChannel.send(msg);
    }
}
