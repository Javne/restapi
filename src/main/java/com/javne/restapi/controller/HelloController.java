package com.javne.restapi.controller;


import com.javne.restapi.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService; // wstrzykniecie za pomoca konstruktora stworzonego przez lomboka

    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }
}
