package com.example.myscram;

import com.example.myscram.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class MyscramApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyscramApplication.class, args);
    }

}
