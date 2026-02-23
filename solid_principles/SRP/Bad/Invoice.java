package solid_principles.SRP.Bad;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed for amount " + amount);
    }

    // Method that concerns another service => Breaks SRP
    public void saveToDatabase() {
        System.out.println("Saving invoice to database");
    }

    // Method that concerns another service => Breaks SRP
    public void sendEmailNotification() {
        System.out.println("Sending email notification for invoice");
    }

    // Solution creating classes that handles concerned services to
    // implement the wanted methods
}
