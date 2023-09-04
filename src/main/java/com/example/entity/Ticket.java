package com.example.entity;

import com.example.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import java.time.Instant;

@Data
@Entity
@AllArgsConstructor
@Table(name = "tickets")

public class Ticket {
    @Id
    private Long id;
    private String taskBody;
    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;
    @ManyToOne
    @JoinColumn(name = "assignor_id")
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
