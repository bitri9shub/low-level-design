import java.util.HashMap;

public class PaymentService {
    HashMap<String, IPaymentMethod> paymentMethods;

    PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, IPaymentMethod pm) {
        paymentMethods.put(name, pm);
    }

    public void makePayment(String name) {
        IPaymentMethod pm = paymentMethods.get(name);
        pm.pay(); // runtime polymorphism
    }
}
