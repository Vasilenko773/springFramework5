package data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigInDataBase {

    @Bean
    public FakeDataSource fakeDataSource(ClassConfiguration classConfiguration) {
        return new FakeDataSource(classConfiguration.getUsername(), classConfiguration.getPassword(), classConfiguration.getUrl());
    }
}
