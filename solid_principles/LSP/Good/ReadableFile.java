package solid_principles.LSP.Good;

public class ReadableFile implements IReadable {
    public void read() {
        System.out.println("Reading from a file");
    }
}
