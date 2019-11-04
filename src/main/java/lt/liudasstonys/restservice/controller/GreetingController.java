package lt.liudasstonys.restservice.controller;

import lt.liudasstonys.restservice.entity.Greeting;
import lt.liudasstonys.restservice.helper.Helper;
import lt.liudasstonys.restservice.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = (AtomicLong) Helper.ctx.getBean("getCounter");
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingService.createGreeting(name, counter);
    }

    @GetMapping("/greeting/{name}")
    public Greeting greetingWithName(@PathVariable(value="name") String name) {
        return greetingService.createGreeting(name, counter);
    }
}