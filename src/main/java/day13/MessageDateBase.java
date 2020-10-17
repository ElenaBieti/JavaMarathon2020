package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDateBase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }
    public static void ShowDialog(User u1, User u2) {
        for(Message message : messages ) {
            if(message.getSender() == u1 && message.getReciever() == u2 ||
                    message.getSender() == u2 && message.getReciever() == u1) {
                System.out.println(message.getSender() + ": " + message.getText());
            }

        }
    }

}
