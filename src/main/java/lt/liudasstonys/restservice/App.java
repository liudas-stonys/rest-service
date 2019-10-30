package lt.liudasstonys.restservice;

import lt.liudasstonys.restservice.helper.Helper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://spring.io/guides/gs/rest-service/
// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        Helper.logBeans();
    }
}
