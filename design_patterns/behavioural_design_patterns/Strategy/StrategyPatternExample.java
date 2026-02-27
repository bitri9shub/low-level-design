package design_patterns.behavioural_design_patterns.Strategy;

interface PaymentMethod {
    void pay();
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Credit card process..");
    }
}

class DebitCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Debit card process..");
    }
}

class PaymentService {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod debitCard = new DebitCard();

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment(creditCard);
        paymentService.processPayment(debitCard);

    }
}
