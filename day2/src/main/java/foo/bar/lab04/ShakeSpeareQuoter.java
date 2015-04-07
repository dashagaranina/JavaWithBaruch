package foo.bar.lab04;

import org.springframework.stereotype.Component;

@Component
@QuoterQualifier(QuoterType.SHAKESPEARE)
public class ShakeSpeareQuoter implements Quoter {
    @Override
    public String sayQuote() {
        return "2b|!2b";
    }
}
