package foo.bar.lab04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    @Autowired
    @QuoterQualifier(QuoterType.TERMINATOR)
    private Quoter quoter;

    public void setQuoter(Quoter quoter) {
        this.quoter = quoter;
    }

    public String talk(){
        return quoter.sayQuote();
    }
}
