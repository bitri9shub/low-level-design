package solid_principles.LSP.Good;

public class WritableFile extends ReadableFile implements Iwritable {
    @Override
    public void write() {
        System.out.println("Writing to a file");
    }
}
