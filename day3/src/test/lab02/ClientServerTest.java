package lab02;

import foo.bar.lab02.Greeter;
import foo.bar.lab02.ClientAppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientServerTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext contextClient = new AnnotationConfigApplicationContext(ClientAppConfig.class);
        Greeter obj = contextClient.getBean(Greeter.class);
        System.out.println(obj.greet());
    }
}
