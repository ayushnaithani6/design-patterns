package src.main.java.com.solidprinciples.dependencyinversion.badpath;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Message msg = new Message("This is a new message");
        MessagePrinter printer = new MessagePrinter();
        printer.writeMessage(msg);
    }
}
