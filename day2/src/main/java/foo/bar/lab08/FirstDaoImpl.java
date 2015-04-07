package foo.bar.lab08;

import org.springframework.stereotype.Component;

@Component
@Oracle
public class FirstDaoImpl implements Dao {
    @Override
    public void crud() {
        System.out.println("firstCrud");
    }
}
