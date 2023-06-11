package br.com.restcrud.helloworld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    /**
     * REST Client envia a requisção /test/hello para REST Service >
     * REST Client recebe a resposta Hello World! do REST Service <
     */

}