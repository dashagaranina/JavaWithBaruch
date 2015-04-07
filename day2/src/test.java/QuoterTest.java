import foo.bar.lab04.Robot;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class QuoterTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("foo.bar.lab04");
        Map<String, Robot> beans = context.getBeansOfType(Robot.class);
        Assert.assertEquals(1, beans.size());
        Assert.assertEquals("I'll be back!", beans.get("robot").talk());
    }
}
