package br.com.sbs.testezup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestezupApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestezupApplication.class, args);
    }

}
