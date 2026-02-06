public class Main {
    public static void main(String[] args) {
        Document doc = new Document("Hello World");
        Printer printer = new Printer();
        printer.printDocument(doc);
    }
}