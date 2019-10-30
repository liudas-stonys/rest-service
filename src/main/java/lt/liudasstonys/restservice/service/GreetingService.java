package lt.liudasstonys.restservice.service;

import lt.liudasstonys.restservice.entity.Greeting;
import java.util.concurrent.atomic.AtomicLong;

public interface GreetingService {
    Greeting createGreeting(String name, AtomicLong counter);
}
