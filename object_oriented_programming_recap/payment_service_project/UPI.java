public class UPI implements IPaymentMethod {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI " + upiId);
    }
}
