package foo.bar.lab08;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Dasha on 08.04.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Component
public @interface Derby {
}
