package pindias.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.base")
@Getter
@Setter
public class PropertiesWithJavaConfig {
    private String url;
    private String loginUrl;
    private String service;
}