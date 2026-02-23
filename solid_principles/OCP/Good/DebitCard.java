package solid_principles.OCP.Good;

public class DebitCard implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Debit Card: " + amount);
    }
}
