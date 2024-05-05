package com.example.av_by;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(info = @Info(
        title = "AV_BY на минималках",
        description = "Мои контактные данные:",
        contact = @Contact(name = "Ковалец Владислав",
                url = "https://t.me/kovalecvlad",
                email = "kovalecvlad3@gmail.com")
))
@SpringBootApplication
public class AvByApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvByApplication.class, args);
    }

}
