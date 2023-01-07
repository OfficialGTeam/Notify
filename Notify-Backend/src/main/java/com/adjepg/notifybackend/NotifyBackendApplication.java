package com.adjepg.notifybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class NotifyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotifyBackendApplication.class, args);
    }

}
