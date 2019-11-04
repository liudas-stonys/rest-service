package lt.liudasstonys.restservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.concurrent.atomic.AtomicLong;

@Configuration
public class AppConfig {

    @Bean
    public AtomicLong getCounter() {
        return new AtomicLong();
    }
}
