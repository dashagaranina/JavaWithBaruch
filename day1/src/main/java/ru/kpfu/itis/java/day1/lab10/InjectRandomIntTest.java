package ru.kpfu.itis.java.day1.lab10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectRandomIntTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context10.xml");
        context.getBean(SomeObject.class);
    }
}
