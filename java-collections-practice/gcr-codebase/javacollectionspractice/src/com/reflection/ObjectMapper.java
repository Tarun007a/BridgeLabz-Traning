package com.reflection;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> class1, Map<String, Object> properties) throws Exception {
        T obj = class1.getDeclaredConstructor().newInstance();
        
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            Field field = class1.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }
}
