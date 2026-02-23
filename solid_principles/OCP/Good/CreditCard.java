package solid_principles.OCP.Good;

public class CreditCard implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Credit Card: " + amount);
    }
}
