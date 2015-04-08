package foo.bar.lab02;

import foo.bar.lab02.Greeter;
import foo.bar.lab02.GreeterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
//@ComponentScan("foo.bar.lab02.*")
public class ServerAppConfig {

    @Bean
    public Greeter greeter(){
        return new GreeterImpl();
    }

    @Bean
    public RmiServiceExporter rmiServiceExporter(){
         RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("GreeterService");
        rmiServiceExporter.setService(greeter());
        rmiServiceExporter.setServiceInterface(Greeter.class);
        rmiServiceExporter.setRegistryPort(1199);
        return rmiServiceExporter;
    }
}
