package com.genspark.SpringBootDemoApp.Contoller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    public String home()
    {
        return "<HTML><H1>Welcome to My First Boot Application</H1></HTML>";
    }
}
