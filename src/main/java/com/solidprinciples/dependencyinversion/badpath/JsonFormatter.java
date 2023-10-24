package src.main.java.com.solidprinciples.dependencyinversion.badpath;

public class JsonFormatter implements Formatter {

    @Override
    public String format(Message message) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.toJson(message);
        } catch(Exception e) {
            throw e;
        }
    }
}
