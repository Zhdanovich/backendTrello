package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/getObject")
    public Ticket getObject() {
        Ticket myObject = new Ticket("taskBody",1L,"assignedUser","assignor","title",
                LocalDateTime.now(), "11-11-2011 12:09", "done");

        return myObject;
    }
}