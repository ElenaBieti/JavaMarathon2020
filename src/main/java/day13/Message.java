package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User reciever;
    private String text;
    private Date date;
    public Message(User sender, User reciever, String text) {

        this.sender = sender;
        this.reciever = reciever;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReciever() {
        return reciever;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString () {
        return "FROM: " + this.sender + "\nTO " + reciever +
                "\nON: " + date + "\n" + text + "\n";


    }
}
