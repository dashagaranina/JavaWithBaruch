package lab06;

import foo.bar.lab06.AppConfig;
import foo.bar.lab06.DatabaseException;
import foo.bar.lab06.SomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Test2 {

    @Autowired
    private SomeService service;

    @Test(expected = DatabaseException.class)
    public void test(){
         service.saveData();
    }
}
