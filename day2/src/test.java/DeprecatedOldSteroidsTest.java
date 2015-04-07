import foo.bar.lab01.AwecomeNewStuff;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class DeprecatedOldSteroidsTest {

    @Test
    public void deprecatedOldSteroidsTest (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context01.xml");
        Object replacedBean = context.getBean("replacedBean");
        assertEquals(AwecomeNewStuff.class, replacedBean.getClass());

    }
}
