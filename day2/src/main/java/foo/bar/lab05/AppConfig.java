package foo.bar.lab05;

import foo.bar.lab02.StringBuilderFactoryBean;
import foo.bar.lab04.Quoter;
import foo.bar.lab04.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:file.properties")
public class AppConfig {

    @Value("${fileName}")
    private String fileName;

    @Autowired
    private StringBuilder stringBuilder;

    @Bean
    @DependsOn("fileCreator")
    public FileConsumer fileConsumer(){
        return new FileConsumer(fileName);
    }

    @Bean
    public FileCreator fileCreate () {
        return new FileCreator(fileName);
    }

    @Bean
    public Quoter terminatorQuoter(){
         return new CustomQuoter(stringBuilder);
    }

    @Bean
    public Robot robot(){
        Robot robot = new Robot();
        robot.setQuoter(terminatorQuoter());
        return robot;
    }

    @Bean
    public StringBuilderFactoryBean stringBuilder(){
        StringBuilderFactoryBean stringBuilderFactoryBean=new StringBuilderFactoryBean();
        stringBuilderFactoryBean.setStart("Start");
        stringBuilderFactoryBean.setMiddle("Middle");
        stringBuilderFactoryBean.setFinish("Finish");
        return stringBuilderFactoryBean;
    }
}
