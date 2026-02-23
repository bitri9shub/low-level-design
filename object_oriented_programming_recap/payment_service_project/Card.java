abstract public class Card implements IPaymentMethod{
    private String cardNo;
    private String username;

    public Card(String cardNo, String username) {
        this.cardNo = cardNo;
        this.username = username;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getUsername() {
        return username;
    }
}