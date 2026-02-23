public class CreditCard extends Card {
    public CreditCard(String cardNo, String username) {
        super(cardNo, username);
    }

    @Override
    public void pay() {
        System.err.println("Making payment via credit card");
    }
}
