package solid_principles.ISP.Good;

public class SImplePrinter implements IPrinter {
    // Valid ISP
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
