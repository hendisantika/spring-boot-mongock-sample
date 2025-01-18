package id.my.hendisantika.mongock;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableMongock
@SpringBootApplication
public class SpringBootMongockSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongockSampleApplication.class, args);
    }

}
