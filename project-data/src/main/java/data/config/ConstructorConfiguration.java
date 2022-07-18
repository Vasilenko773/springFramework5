package data.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConfigurationProperties(value = "config")
@ConstructorBinding
/*@ConstructorBinding - используется для указания выбора конструктора по уполчания*/
@RequiredArgsConstructor
public class ConstructorConfiguration {

    private final String username;
    private final String password;
    private final String url;
}
