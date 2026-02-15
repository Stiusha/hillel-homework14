public class Main {
    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();
        printer.print(new PrinterImpl.Message("Hello", "Anastasiia"));
        printer.print(new PrinterImpl.Message("Hello", ""));
        printer.print(new PrinterImpl.Message("", "Anastasiia"));
        printer.print(new PrinterImpl.Message(null, "Anastasiia"));
        printer.print(new PrinterImpl.Message("Hello", null));
        printer.print(new PrinterImpl.Message(null, null));
        printer.print(new PrinterImpl.Message("", ""));
    }
}