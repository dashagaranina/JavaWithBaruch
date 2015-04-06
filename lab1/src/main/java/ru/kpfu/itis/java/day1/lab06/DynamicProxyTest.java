package ru.kpfu.itis.java.day1.lab06;

import ru.kpfu.itis.java.day1.lab05.RealSubject;
import ru.kpfu.itis.java.day1.lab05.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class}, new InvocationHandler() {
                    private RealSubject realSubject = new RealSubject();
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                         long startTime = System.currentTimeMillis();
                        Object retValue = method.invoke(realSubject);
                        System.out.println("Invocation time: "+(System.currentTimeMillis()-startTime));
                        return retValue;
                    }
                });
        subject.longMethod();
    }
}
