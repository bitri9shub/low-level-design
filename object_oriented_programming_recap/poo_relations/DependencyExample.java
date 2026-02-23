package object_oriented_programming_recap.poo_relations;

public class DependencyExample {
    static public class Document {
        private String content;

        public Document(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }
    }

    static public class Printer {
        public void print(Document doc) {
            System.out.println("Printing document: " + doc.getContent());
        }
    }

    public static void main(String[] args) {
        Document doc = new Document("Dependency example");
        Printer printer = new Printer();

        printer.print(doc);
    }
}
