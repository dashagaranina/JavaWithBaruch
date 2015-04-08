package foo.bar.lab03;


public abstract class SpeakingRobot implements Robot{


    public String speak(){
        return getRandomQuoter().getRandomQuote();
    }
}
