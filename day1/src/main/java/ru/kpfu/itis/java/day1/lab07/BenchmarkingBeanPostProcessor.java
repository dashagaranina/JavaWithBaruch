package ru.kpfu.itis.java.day1.lab07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

public class BenchmarkingBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
            return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), (proxy, method, args) -> {
            if (bean.getClass().getMethod(method.getName(), method.getParameterTypes()).getAnnotation(Benchmark.class) != null) {
                long start = System.currentTimeMillis();
                Object returnValue = method.invoke(bean, args);
                System.out.println("Invocation time: " + (System.currentTimeMillis() - start));
                return returnValue;
            }
            return method.invoke(bean, args);
        });
    }
}
