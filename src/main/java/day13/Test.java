package day13;

public class Test {
    public static void main (String[]args) {
        User user1 = new User("user1");
        User user2 = new User ("user2");
        User user3 = new User ("user3");

        user1.sendMessage(user2, "Hello from user1!");
        user1.sendMessage(user2, "How are you");

        user2.sendMessage(user1, "Hi user1");
        user2.sendMessage(user1, "I'm user2 nice to meet you.");
        user2.sendMessage(user1, "i'm fine, and you?");

        user3.sendMessage(user1, "Hi my name is user3");
        user3.sendMessage(user1, "How are doing");
        user3.sendMessage(user1, "We went to the same school");

        user1.sendMessage(user3, "Hi user3!");
        user1.sendMessage(user3, "Nice to see you again");
        user1.sendMessage(user3, "Let's meet up");

        user3.sendMessage(user1, "Ok");

        MessageDateBase.ShowDialog(user1, user3);
    }
}
