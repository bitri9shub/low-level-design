package solid_principles.LSP.Good;

public class Main {
    public static void readAnyFIle(ReadableFile file) {
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readOnlyFile = new ReadOnlyFile();
        // readOnlyFile.read();

        WritableFile writableFile = new WritableFile();
        // writableFile.read();
        // writableFile.write();

        // here we're replacing the children within the parent class
        // valid LSP
        readAnyFIle(readOnlyFile);
        readAnyFIle(writableFile);
    }
}
