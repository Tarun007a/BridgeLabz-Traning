package com.reflection;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Class<?> class1 = Configuration.class;
        Field field = class1.getDeclaredField("API_KEY");
        
        field.setAccessible(true);
        field.set(null, "NEW_KEY");
        
        System.out.println(field.get(null));
    }
}
