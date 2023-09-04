package com.example.service;

import com.example.entity.Ticket;
import com.example.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {

    private final TicketRepository repository;

    public Ticket create(Ticket ticket) {
        return repository.save(ticket);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Ticket findById(Long id) {
        log.info(String.valueOf(repository.findById(id)));
        return repository.findById(id).orElseThrow();
    }

    public List<Ticket> findAllProducts() {
        return repository.findAll();
    }
}
