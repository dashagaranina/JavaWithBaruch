package ru.kpfu.itis.java.day1.lab02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuoterTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Quoter quoter = (Quoter) context.getBean("terminatorQuoter");
        quoter.sayQuote();
    }
}
