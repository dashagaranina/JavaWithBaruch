package foo.bar.lab03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Robot robot(){
        return new SpeakingRobot() {
            @Override
            public RandomQuoter getRandomQuoter() {
                return quoter();
            }
        };
    }

    @Bean
    @Scope("prototype")
    public RandomQuoter quoter(){
        System.out.println("Creating new quoter!");
        return new RandomQuoter();
    }
}
