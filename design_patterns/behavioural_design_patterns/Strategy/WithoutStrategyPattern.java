package design_patterns.behavioural_design_patterns.Strategy;

class PaymentService {
    public void processPayment(String paymentMethod) {
        // breaks open closed principle
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Credit card process..");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Debit card process..");
        } else {
            System.out.println("Unsupported method");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CreditCard");
        paymentService.processPayment("SomethingElse");
    }
}
