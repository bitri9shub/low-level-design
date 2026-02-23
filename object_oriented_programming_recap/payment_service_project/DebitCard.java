public class DebitCard extends Card {
    public DebitCard(String cardNo, String username) {
        super(cardNo, username);
    }

    @Override
    public void pay() {
        System.err.println("Making payment via debit card");
    }
}
