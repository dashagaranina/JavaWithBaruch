package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUrl("jdbc:h2:~/lab01");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

//        костыль чтобы работать с бд. раскоментить только для первого запуска!!!
//          потом снова в коммент. и этот коммент тоже удалить. todo все удалить...

//        jdbcTemplate.execute("drop table event; drop table guest;");
//        jdbcTemplate.execute("create table event(" +
//                "id bigint, e_name varchar(255), address varchar(255));" +
//                "insert into event (id, e_name) values ('1' , 'PartyForEveryBody!');");
//
//        jdbcTemplate.execute("create table guest(" +
//                "id bigint, g_name varchar(255), event_id bigint);" +
//                "insert into guest (id, g_name, event_id) values ('1' , 'John Smith', '1');");

        return jdbcTemplate;
    }


}