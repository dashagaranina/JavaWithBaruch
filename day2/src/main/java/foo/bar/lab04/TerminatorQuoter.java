package foo.bar.lab04;

import org.springframework.stereotype.Component;

@Component
@QuoterQualifier(QuoterType.TERMINATOR)
public class TerminatorQuoter implements Quoter {
    @Override
    public String sayQuote() {
        return "I'll be back!";
    }
}
