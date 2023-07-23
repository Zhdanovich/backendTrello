package com.example;

import com.example.Converter.TicketConverter;
import com.example.DTO.TicketDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    // is used to convert Ticket for proper print out
    TicketConverter ticketConverter = new TicketConverter();

    com.example.User firstUser = new com.example.User(1L,"developer","Andrej");
    com.example.User secondUser = new User(2L, "TeamLead", "Kiril");
    com.example.Ticket ticketOne = new com.example.Ticket("taskBody",1L, firstUser, secondUser,"title", 1694463425L, TicketStatus.DONE );
    com.example.Ticket ticketTwo = new com.example.Ticket("secondTask",2L, secondUser, firstUser,"newTitle", 1694463425L, TicketStatus.DONE );

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