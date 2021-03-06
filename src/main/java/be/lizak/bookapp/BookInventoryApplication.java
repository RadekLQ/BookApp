package be.lizak.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

import static java.util.Locale.ENGLISH;

@SpringBootApplication
@EnableAspectJAutoProxy

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

//    Only for not Spring Boot Application
//    @Bean
//    public MessageSource mySource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
}
