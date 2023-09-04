package com.example.converter;

import com.example.DTO.TicketDto;
import com.example.entity.Ticket;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TicketConverter {

    public TicketDto convert(Ticket ticket) {

        UserConverter userConverter = new UserConverter();
        TicketDto ticketDto = new TicketDto();

        // all user will have only String nameSurname printed
        ticketDto.setAssignor(userConverter.convert(ticket.getAssignor()));
        ticketDto.setAssignedUser(userConverter.convert(ticket.getAssignedUser()));

        ticketDto.setTitle(ticket.getTitle());
        ticketDto.setStatus(ticket.getStatus());
        ticketDto.setTaskBody(ticket.getTaskBody());

        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(ticket.getDeadlineDate(), 0, ZoneOffset.ofHours(3));
        ticketDto.setDeadlineDate(dateTime);

        return ticketDto ;
    }

    public TicketConverter() {
    }
}
