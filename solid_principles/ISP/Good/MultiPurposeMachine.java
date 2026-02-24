package solid_principles.ISP.Good;

public class MultiPurposeMachine implements ICopier, IScanner, IPrinter {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
    @Override
    public void copy() {
        System.out.println("Copying document...");
    }
}
