package src.main.java.com.solidprinciples.dependencyinversion.badpath;

import java.time.LocalDateTime;

public class Message {
    private String msg;
    private LocalDateTime timestamp;

    public Message(String msg) {
        this.msg = msg;
        this.timestamp = LocalDateTime.now();
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
