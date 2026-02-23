package solid_principles.OCP.Good;

public class Paypal implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Paypal: " + amount);
    }
}
