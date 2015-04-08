package ru.kpfu.itis.java.day1.lab02;

public class ShakespeareQuoter implements Quoter{
    private String quote;

    @Override
    public void sayQuote() {
        System.out.println(quote);
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
