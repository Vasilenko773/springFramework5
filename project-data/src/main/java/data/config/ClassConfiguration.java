package data.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(value = "config")
@Configuration
@Getter
@Setter
@RequiredArgsConstructor
public class ClassConfiguration {

    private String username;
    private String password;
    private String url;
}
