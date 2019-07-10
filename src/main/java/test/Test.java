package test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VampireDX on 2016/7/3.
 */
@RestController
@SpringBootApplication
@Slf4j
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class);
    }

    @RequestMapping
    public String hello() {
        return "Hello word!";
    }
}
