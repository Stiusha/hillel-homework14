public class PrinterImpl implements Printer<PrinterImpl.MessageImpl> {
    @Override
    public void print(MessageImpl message) {
        if ((message.getSender() == null || message.getSender().isEmpty()) && (message.getText() == null || message.getText().isEmpty())) {
            System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
        }
        if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
            return;
        }
        System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());

    }

    public static class MessageImpl implements Message {
        private String text;
        private String sender;

        public MessageImpl(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}
