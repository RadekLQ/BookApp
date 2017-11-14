package be.lizak.bookapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("messages-prod.properties")
public class AppConfig_Prod {

}
