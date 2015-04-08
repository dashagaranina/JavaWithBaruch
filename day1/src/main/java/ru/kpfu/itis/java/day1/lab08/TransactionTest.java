package ru.kpfu.itis.java.day1.lab08;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.java.day1.lab05.Subject;

public class TransactionTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context07.xml");
        Subject subject = context.getBean(Subject.class);
        subject.longMethod();
    }
}
