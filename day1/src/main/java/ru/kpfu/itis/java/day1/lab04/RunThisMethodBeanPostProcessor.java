package ru.kpfu.itis.java.day1.lab04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.kpfu.itis.java.day1.lab01.RunThisMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunThisMethodBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        Method[] methods = bean.getClass().getMethods();
        for (Method method: methods){
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation!=null){
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    try {
                        method.invoke(bean);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("BPP runs  on "+ s + "!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        return bean;
    }
}
