package ru.kpfu.itis.java.day1.lab08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TransactionBeanPostProcessor implements BeanPostProcessor {

    private List<String> classes = new ArrayList<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().getAnnotation(Transaction.class)!=null){
            classes.add(beanName);
        }
         return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (classes.contains(beanName)) {
            return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), (proxy, method, args) -> {
                System.out.println("transaction start");
                Object value = method.invoke(bean, args);
                System.out.println("transaction commit");
                return value;
            });
        }  else {
            return bean;
        }
    }
}
