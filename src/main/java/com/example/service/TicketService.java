package com.example.service;

import com.example.entity.Ticket;
import com.example.repository.TicketRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
//@Slf4j
public class TicketService {

    private final TicketRepository repository;

    public Ticket create(Ticket ticket) {
        return repository.save(ticket);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Ticket findById(Long id) {
       // log.info(String.valueOf(repository.findById(id)));
        return repository.findById(id).orElseThrow();
    }

    @Transactional
    public Ticket update(Long id, Ticket ticket) {
        Ticket ticketToUpdate = repository.findById(id).orElseThrow();
        ticketToUpdate.setStatus(ticket.getStatus());
        ticketToUpdate.setTitle(ticket.getTitle());
        ticketToUpdate.setAssignor(ticket.getAssignor());
        ticketToUpdate.setAssignedUser(ticket.getAssignedUser());
        ticketToUpdate.setDeadlineDate(ticket.getDeadlineDate());
        return repository.save(ticketToUpdate);
    }

    public List<Ticket> findAllProducts() {
        return repository.findAll();
    }
}
