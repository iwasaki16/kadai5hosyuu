package jp.te4a.spring.boot.mybootapp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Hello world!
 *
 */
 @SpringBootApplication
 @EnableAutoConfiguration
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}

