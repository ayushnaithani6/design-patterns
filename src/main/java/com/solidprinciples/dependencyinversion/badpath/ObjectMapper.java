package src.main.java.com.solidprinciples.dependencyinversion.badpath;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapper {

    public String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            String name = field.getName();
            Object value;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field: " + name, e);
            }

            if (json.length() > 1) {
                json.append(",");
            }

            json.append("\"").append(name).append("\":");
            if (value == null) {
                json.append("null");
            } else if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value.toString());
            }
        }

        json.append("}");
        return json.toString();
    }

    public <T> T fromJson(String json, Class<T> clazz) {
        Map<String, Object> jsonMap = parseJson(json);
        T obj;
        try {
            obj = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Error creating instance of class: " + clazz.getName(), e);
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = jsonMap.get(name);
            try {
                field.set(obj, value);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error setting field value: " + name, e);
            }
        }

        return obj;
    }

    private Map<String, Object> parseJson(String json) {
        // Simple parsing, not handling nested structures or special characters
        Map<String, Object> jsonMap = new HashMap<>();
        String[] pairs = json.substring(1, json.length() - 1).split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim().replaceAll("\"", "");
            Object value = parseValue(keyValue[1].trim().replaceAll("\"", ""));
            jsonMap.put(key, value.equals("null") ? null : value);
        }
        return jsonMap;
    }

    private Object parseValue(String value) {
        // To handle Integer values
        if(value.matches("-?\\d+")) {
            return Integer.parseInt(value);
        }
        return value;
    }
}
