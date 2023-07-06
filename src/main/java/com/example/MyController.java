package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/getObject")
    public Ticket getObject() {
        Ticket ticket = new Ticket("taskBody",1L,"assignedUser","assignor","title", 1694463425L, TicketStatus.DONE );

        return ticket;
    }
}