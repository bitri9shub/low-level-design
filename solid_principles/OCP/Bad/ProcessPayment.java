package solid_principles.OCP.Bad;

public class ProcessPayment {
    public void processPayment(String paymentMetod, double amount) {
        // if we want to add new payment method we should modify
        // this code => breaks OCP
        if (paymentMetod.equals("CreditCard")) {
            System.out.println("Making payment via Credit Card: " + amount);
        } else if (paymentMetod.equals("DebitCard")) {
            System.out.println("Making payment via Debit Card: " + amount);
        } else if (paymentMetod.equals("Paypal")) {
            System.out.println("Making payment via Paypal: " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMetod);
        }
    }
}
