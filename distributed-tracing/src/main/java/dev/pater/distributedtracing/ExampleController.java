package dev.pater.distributedtracing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private final MyExampleService myExampleService;

    public ExampleController(MyExampleService myExampleService) {
        this.myExampleService = myExampleService;
    }

    @GetMapping
    public String get() {
        return myExampleService.doSomething();
    }
}
