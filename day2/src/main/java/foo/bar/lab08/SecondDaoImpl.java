package foo.bar.lab08;

import org.springframework.stereotype.Component;

@Component
@Derby
public class SecondDaoImpl implements Dao {
    @Override
    public void crud() {
        System.out.println("secondCrud");
    }
}
