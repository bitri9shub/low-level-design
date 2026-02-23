package solid_principles.LSP.Bad;

public class ReadOnlyFile extends File {
    @Override
    public void write() {
        // this breaks the Liskov Subtitution principle
        throw new UnsupportedOperationException("Can't write to read only files");
    }
}
