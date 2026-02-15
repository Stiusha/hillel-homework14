public interface Printer<T extends Printer.Message> {
    void print(T message);
    interface Message {
    }
}
