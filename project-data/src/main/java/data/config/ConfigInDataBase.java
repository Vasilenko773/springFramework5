package data.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ConstructorConfiguration.class)
//EnableConfigurationProperties - используется для привязки свойст конфигурации к POJO
public class ConfigInDataBase {

    @Bean
    public FakeDataSource fakeDataSource(ConstructorConfiguration constructorConfiguration) {
        return new FakeDataSource(constructorConfiguration.getUsername(), constructorConfiguration.getPassword(), constructorConfiguration.getUrl());
    }
}
