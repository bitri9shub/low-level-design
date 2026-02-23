package solid_principles.SRP.Good;

public class InvoiceGood {
    private double amount;

    public InvoiceGood(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed for amount " + amount);
    }
}
