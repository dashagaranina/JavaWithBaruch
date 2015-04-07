package foo.bar.lab04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Dasha on 07.04.2015.
 */
@Component
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QuoterQualifier {
    QuoterType value();
}
