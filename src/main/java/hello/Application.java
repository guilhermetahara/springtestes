package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //define como aplicaçao spring
public class Application {
    public static void main(String[] args) {
        //roda aplicaçao
        SpringApplication.run(Application.class, args);
    }
}
