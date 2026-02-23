public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("DC", new DebitCard("1234", "lamghari ahmed"));
        ps.addPaymentMethod("CC", new CreditCard("151520", "lamghari ahmed"));
        ps.addPaymentMethod("UPI", new UPI("1234"));
        ps.addPaymentMethod("WALLET", new Wallet());

        ps.makePayment("WALLET");
    }
}
