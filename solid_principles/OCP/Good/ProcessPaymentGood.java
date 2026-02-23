package solid_principles.OCP.Good;

public class ProcessPaymentGood {
    public void processPayment(IPaymentMethod paymentMetod, double amount) {
        paymentMetod.pay(amount);
    }
}
