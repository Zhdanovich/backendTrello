package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/getObject")
    public Ticket getObject() {
        Ticket myObject = new Ticket();
        myObject.setTaskBody("do dishes");
        return myObject;
    }
}