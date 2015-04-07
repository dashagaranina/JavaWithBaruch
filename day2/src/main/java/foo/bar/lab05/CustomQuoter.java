package foo.bar.lab05;

import foo.bar.lab04.Quoter;

public class CustomQuoter implements Quoter {
    private StringBuilder stringBuilder;

    public CustomQuoter(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public String sayQuote() {
        return stringBuilder.toString();
    }
}
