package data.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class ConfigInDataBase {

    @Bean
    public FakeDataSource fakeDataSource(@Value("${config.username}") String username, @Value("${config.password}")String password,
                                     @Value("${config.url}") String url) {
        return new FakeDataSource(username, password, url);
    }
}
