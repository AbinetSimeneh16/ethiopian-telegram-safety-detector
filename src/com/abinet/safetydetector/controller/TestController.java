package com.abinet.safetydetector.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Ethiopian Telegram Safety Detector is running!";
    }
}
