package ru.kpfu.itis.java.day1.lab03;

import ru.kpfu.itis.java.day1.lab01.RunThisMethod;
import ru.kpfu.itis.java.day1.lab02.Quoter;

import java.util.List;

public class TalkingRobot implements Robot {
    private List<Quoter> quoters;

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @Override
    @RunThisMethod
    public void talk() {
        for (Quoter quoter: quoters){
            quoter.sayQuote();
        }
    }
}
