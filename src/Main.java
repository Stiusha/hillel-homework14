public class Main {
    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();
        printer.print(new PrinterImpl.MessageImpl("Hello", "Anastasiia"));
        printer.print(new PrinterImpl.MessageImpl("Hello", ""));
        printer.print(new PrinterImpl.MessageImpl("", "Anastasiia"));
        printer.print(new PrinterImpl.MessageImpl(null, "Anastasiia"));
        printer.print(new PrinterImpl.MessageImpl("Hello", null));
        printer.print(new PrinterImpl.MessageImpl(null, null));
        printer.print(new PrinterImpl.MessageImpl("", ""));
    }
}