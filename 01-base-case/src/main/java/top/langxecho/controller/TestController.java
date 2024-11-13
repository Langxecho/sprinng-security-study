package top.langxecho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/13 16:29
 */

@RestController
public class TestController {
    @GetMapping("/test")
    public Object test() {
        return "Hello World!";
    }
}