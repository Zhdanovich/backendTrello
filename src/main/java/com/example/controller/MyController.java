package com.example.controller;

import com.example.TicketStatus;
import com.example.converter.TicketConverter;
import com.example.DTO.TicketDto;
import com.example.entity.Ticket;
import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    TicketConverter ticketConverter = new TicketConverter();  // is used to convert Ticket for proper print out

    User firstUser = new User(1L,"developer","Andrej");
    User secondUser = new User(2L, "TeamLead", "Kiril");
    Ticket ticketOne = new Ticket("taskBody",1L, firstUser, secondUser,"title", 1694463425L, TicketStatus.DONE );
    Ticket ticketTwo = new Ticket("secondTask",2L, secondUser, firstUser,"newTitle", 1694463425L, TicketStatus.DONE );

    // gets one ticket without DTO
    @GetMapping("/getTicket")
    public Ticket getTicket() {

        return ticketOne;
    }

    @GetMapping("/getTicketList")
    public  List<TicketDto> getTicketList() {

        List<TicketDto> ticketList = new ArrayList<>();

        ticketList.add(ticketConverter.convert(ticketOne));
        ticketList.add(ticketConverter.convert(ticketTwo));

        return ticketList;
    }
}