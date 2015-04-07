import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
public class AppConfigFileDependencyTest extends TestCase {

    @Test
    public void testFileDependency(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("foo.bar.lab5");

    }
}
