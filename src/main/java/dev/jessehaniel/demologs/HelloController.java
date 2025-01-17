package dev.jessehaniel.demologs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @GetMapping
    public String hello() {
        log.info("log: Hello World!");
        return "Hello World!";
    }

}
