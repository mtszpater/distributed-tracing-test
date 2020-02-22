package dev.pater.distributedtracing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ExampleController {

    private final RestTemplate restTemplate;

    public ExampleController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String get() {
        String onet = restTemplate.exchange("https://onet.pl/",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
                }).getBody();
        String interia = restTemplate.exchange("https://interia.pl/",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
                }).getBody();

        log.info("Hi from second application");
        return "hello";
    }
}
