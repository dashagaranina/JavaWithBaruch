package foo.bar.lab01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan("foo.bar.lab01")
public class AppConfig {
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:~/lab01");
//            dataSource.setUser("postgres");
//            dataSource.setPassword("postgres");
        return dataSource;
    }
}
