package solid_principles.LSP.Bad;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();

        file.read(); // works fine
        file.write(); // throws exception

    }
}
