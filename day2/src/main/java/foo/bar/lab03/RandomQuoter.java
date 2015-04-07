package foo.bar.lab03;

import java.util.Random;

public class RandomQuoter {
    private String randomQuote;

    public RandomQuoter() {
        Random random = new Random();
        randomQuote = Integer.toHexString(random.nextInt());
    }

    public String getRandomQuote(){
        return randomQuote;
    }


}
