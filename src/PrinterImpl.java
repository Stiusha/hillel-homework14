public class PrinterImpl implements Printer {

    public void print(Message message) {
        if ((message.getSender() == null || message.getSender().isEmpty()) && (message.getText() == null || message.getText().isEmpty())) {
            new Printer() {
                @Override
                public void print(String message) {
                    System.out.println(message);
                }
            }.print("Опрацьовується пусте повідомлення від анонімного користувача...");
            return;
        }
        if (message.getSender() == null || message.getSender().isEmpty()) {
            print("Анонімний користувач відправив повідомлення: " + message.getText());
            return;
        }
        print("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
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
