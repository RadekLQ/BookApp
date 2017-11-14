package be.lizak.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

import static java.util.Locale.ENGLISH;

@SpringBootApplication
public class BookInventoryApplication {

    @Autowired
    private static MessageSource messageSource;

    public static void main(String[] args) {

        Locale english = ENGLISH;
        Locale dutch = new Locale("nl", "BE");

        System.out.println("Titel= " + messageSource.getMessage("titel", null, english));
        System.out.println("Titel= " + messageSource.getMessage("titel", null, dutch));

        SpringApplication.run(BookInventoryApplication.class, args);
    }

    @Bean
    public MessageSource mySource() {
        return new ResourceBundleMessageSource();
    }
}
