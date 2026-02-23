package solid_principles.ISP.Good;

public class SImplePrinter implements IPrinter {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
