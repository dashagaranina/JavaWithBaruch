package foo.bar.lab02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextServer = new AnnotationConfigApplicationContext(ServerAppConfig.class);
    }
}
