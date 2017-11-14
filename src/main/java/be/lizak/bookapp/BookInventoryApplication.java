package be.lizak.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
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

        SpringApplication.run(BookInventoryApplication.class, args);

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");


        Locale english = ENGLISH;
        Locale dutch = new Locale("nl", "BE");

        System.out.println("Title= " + messageSource.getMessage("title", new String [] {"Book","Radek"}, english));
        System.out.println("Title= " + messageSource.getMessage("title", new String []  {"Boek", "Radek"}, dutch));


    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BookInventoryApplication.class);
    }

//    Only for not Spring Boot Application
//    @Bean
//    public MessageSource mySource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
}
