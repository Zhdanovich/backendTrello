package com.example;

import lombok.Data;

import java.time.Instant;

@Data

public class Ticket {

    private String taskBody;
    private Long id;
    private User assignedUser;
    private User assignor;
    private String title;
    private Long createdTime; // saved as unix timestamp
    private Long deadlineDate; // saved as unix timestamp

    private TicketStatus status;

    public Ticket() {
    }

    public Ticket(String taskBody, Long id, User assignedUser, User assignor, String title, Long deadlineDate, TicketStatus status) {
        this.taskBody = taskBody;
        this.id = id;
        this.assignedUser = assignedUser;
        this.assignor = assignor;
        this.title = title;
        this.setCreatedTime(Instant.now().getEpochSecond());
        this.deadlineDate = deadlineDate;
        this.status = status;
    }
}
