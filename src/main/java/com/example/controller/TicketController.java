package com.example.controller;

import com.example.TicketStatus;
import com.example.converter.TicketConverter;
import com.example.DTO.TicketDto;
import com.example.entity.Ticket;
import com.example.entity.User;
import com.example.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tickets")
public class TicketController {

    TicketService ticketService;
    TicketConverter ticketConverter;  // is used to convert Ticket for proper print out

//    User firstUser = new User(1L, "developer", "Andrej");
//    User secondUser = new User(2L, "TeamLead", "Kiryl");
//    Ticket ticketOne = new Ticket("taskBody", 1L, firstUser, secondUser, "title", 1694463425L, TicketStatus.DONE);
//    Ticket ticketTwo = new Ticket("secondTask", 2L, secondUser, firstUser, "newTitle", 1694463425L, TicketStatus.DONE);

    // gets one ticket without DTO
    @GetMapping("/getTicket{id}")
    public Ticket getTicket(@PathVariable Long id) {
        return ticketService.findById(id);
    }

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket) {
        return ticketService.create(ticket);
    }

    @PutMapping({"id"})
    public Ticket update(@PathVariable Long id, @RequestBody Ticket ticket) {
        return ticketService.update(id, ticket);
    }

    @GetMapping("/getTicketList")
    public List<Ticket> getTicketList() {

        User firstUser = new User(1L, "developer", "Andrej");
        User secondUser = new User(2L, "TeamLead", "Kiryl");
        Ticket ticketOne = new Ticket("taskBody", 1L, firstUser, secondUser, "title", 1694463425L, TicketStatus.DONE);
        Ticket ticketTwo = new Ticket("secondTask", 2L, secondUser, firstUser, "newTitle", 1694463425L, TicketStatus.DONE);

//        List<TicketDto> ticketList = new ArrayList<>();

//        ticketList.add(ticketConverter.convert(ticketOne));
//        ticketList.add(ticketConverter.convert(ticketTwo));

        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticketOne);
        ticketList.add(ticketTwo);

        return ticketList;
    }
}