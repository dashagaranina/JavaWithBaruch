package ru.kpfu.itis.java.day1.lab02;


import java.util.List;

public class TerminatorQuoter implements Quoter {
    private List<String> quotes;

    @Override
    public void sayQuote() {
        System.out.println(quotes);
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }
}
