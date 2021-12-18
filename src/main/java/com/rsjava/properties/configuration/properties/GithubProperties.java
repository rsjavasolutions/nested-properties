package com.rsjava.properties.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "github")
public class GithubProperties {

    private final Template template = new Template();

    private final Auth auth = new Auth();

    @Getter
    @Setter
    public static class Template {
        private String url;
        private Map<String, String> names = new HashMap<>();
    }

    @Getter
    @Setter
    public static class Auth {
        private String login;
        private String password;
    }
}
