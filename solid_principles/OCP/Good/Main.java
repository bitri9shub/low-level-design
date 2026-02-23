package solid_principles.OCP.Good;

public class Main {
    public static void main(String[] args) {
        ProcessPaymentGood processor = new ProcessPaymentGood();
        IPaymentMethod creditCard = new CreditCard();
        IPaymentMethod debitCard = new DebitCard();
        IPaymentMethod paypal = new Paypal();

        processor.processPayment(debitCard, 1000);
        processor.processPayment(creditCard, 1000);
        processor.processPayment(paypal, 1000);

        // now if we need new payment method, we have just
        // to create its class and use it
    }
}
