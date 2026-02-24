package solid_principles.ISP.Bad;

public class SimplePrinter implements IMachine {
    // printer is forced to implement scanning and copying
    // => breaking the ISP
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
    @Override
    public void scan() {
        // violates LSP
        throw new UnsupportedOperationException("Scan not supported");
    }
    @Override
    public void copy() {
        // violates LSP
        throw new UnsupportedOperationException("Copy not supported");
    }
}
