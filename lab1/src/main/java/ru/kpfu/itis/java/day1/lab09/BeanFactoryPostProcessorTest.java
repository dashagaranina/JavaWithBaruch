package ru.kpfu.itis.java.day1.lab09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context09.xml");
        DestroyablePrototype bean = context.getBean(DestroyablePrototype.class);
        System.out.println(bean.getUsername());
    }
}