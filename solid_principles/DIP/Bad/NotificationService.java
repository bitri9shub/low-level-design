package solid_principles.DIP.Bad;

public class NotificationService {
    // dependence on classes not abstractions
    // => Breaking DIP
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        // Tight coupling
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }

    public void notifyBySMS(String msg){
        smsService.sendSMS(msg);
    }
}
