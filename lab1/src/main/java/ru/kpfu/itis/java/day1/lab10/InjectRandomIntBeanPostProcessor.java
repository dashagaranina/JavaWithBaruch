package ru.kpfu.itis.java.day1.lab10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

public class InjectRandomIntBeanPostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        Method[] methods = bean.getClass().getMethods();
        for (Method method: methods){
            InjectRandomInt annotation = method.getAnnotation(InjectRandomInt.class);
            if (annotation!=null){
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                try {
                    method.invoke(bean, random.nextInt(max-min));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
