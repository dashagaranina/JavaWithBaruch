import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class StringBuilderFactoryBeanTest {

    @Test
    public void stringBuilderFactoryTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context02.xml");
        StringBuilder builder = context.getBean(StringBuilder.class);
        assertEquals("Start Middle Finish.", builder.toString());
    }
}
