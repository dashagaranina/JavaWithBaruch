package ru.kpfu.itis.java.day1.lab01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectFactory {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName(args[0]);
        Object newInstance = clazz.newInstance();
        System.out.println(newInstance);
        Method[] methods = clazz.getMethods();
        for (Method method: methods){
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation!=null){
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                   method.invoke(newInstance);
                }
            }
        }

    }
}
