package lt.liudasstonys.restservice.service;

import lt.liudasstonys.restservice.entity.Greeting;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final String template = "Hello, %s!";

    @Override
    public Greeting createGreeting(String name, AtomicLong counter) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
