package src.main.java.com.solidprinciples.dependencyinversion.happypath;

import java.io.PrintWriter;

/**
 * Solution: How if we ask for this depn from client of this class ?
 * Now we are injecting Formatter and PrintWriter to this class, So lets say
 * if we are owner of this (i.e MessagePrinter) class and Main Class is client.
 * Let's say Main client changes something in formatter we don't have to make any
 * changes to our code.
 */
public class MessagePrinter {
    public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) {
        writer.println(formatter.format(msg));
        writer.flush();

    }
}



