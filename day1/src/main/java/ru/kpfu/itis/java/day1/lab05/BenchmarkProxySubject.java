package ru.kpfu.itis.java.day1.lab05;

class BenchmarkProxySubject implements Subject {

    private RealSubject subject;

    public BenchmarkProxySubject() {
        this.subject = new RealSubject();
    }

    public BenchmarkProxySubject(RealSubject realSubject) {
    }

    @Override
    public int longMethod() throws InterruptedException {
       long startTime = System.currentTimeMillis();
        int count = subject.longMethod();
        System.out.println("Time: "+ (System.currentTimeMillis()-startTime));
        return count;
    }
}
