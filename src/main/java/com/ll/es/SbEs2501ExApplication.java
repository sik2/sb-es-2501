package com.ll.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SbEs2501ExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbEs2501ExApplication.class, args);
    }

}
