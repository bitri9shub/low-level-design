package solid_principles.ISP.Bad;

public class MultiPurposeMachine implements IMachine {
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
