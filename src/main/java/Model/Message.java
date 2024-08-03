package Model;

public class Message {
    private MessageSubject subject;
    private String email;
    private String orderReference;
    private String messageText;

    public Message(MessageSubject subject, String email, String orderReference, String messageText
    ) {
        this.subject = subject;
        this.email = email;
        this.orderReference = orderReference;
        this.messageText = messageText;
    }

    public MessageSubject getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public String getMessageText() {
        return messageText;
    }
}
