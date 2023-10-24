package src.main.java.com.solidprinciples.dependencyinversion.badpath;

import java.io.PrintWriter;

/** Let's say client of this class want to use different formatter
 * or different PrintWriter alternative then we will have to change the
 * code.
 */
public class MessagePrinter {
    public void writeMessage(Message msg) {
        Formatter formatter = new JsonFormatter(); // depn on Formatter
        try(PrintWriter writer = new PrintWriter(System.out)) { // depn on PrintWriter
            writer.println(formatter.format(msg));
            writer.flush();
        }
    }
}

/**
 * Solution: How if we ask for this depn from client of this class ?
 */


