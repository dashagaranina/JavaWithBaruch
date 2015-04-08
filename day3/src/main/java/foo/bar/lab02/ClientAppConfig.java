package foo.bar.lab02;

import foo.bar.lab02.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
//@ComponentScan("foo.bar.lab02.*")
public class ClientAppConfig {

    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean (){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1199/GreeterService");
        rmiProxyFactoryBean.setServiceInterface(Greeter.class);
        return rmiProxyFactoryBean;
    }
}
