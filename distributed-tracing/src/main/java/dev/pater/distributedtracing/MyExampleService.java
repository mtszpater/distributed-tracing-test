package dev.pater.distributedtracing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyExampleService {
    String doSomething() {
        log.info("my service is doing something");
        return "response";
    }
}
