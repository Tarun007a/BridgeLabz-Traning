package com.reflection;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> class1 = Class.forName("com.reflection.Student");
        
        Constructor<?> constructor = class1.getDeclaredConstructor();
        
        Object obj = constructor.newInstance();
        System.out.println(obj);
    }
}