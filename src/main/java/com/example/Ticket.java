package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data

public class Ticket {

    private String taskBody;
    private Long id;
    private String assignedUser;
    private String assignor;
    private String title;
    private LocalDateTime createdTime;

    //expected to be LocalDateFormat, not String
    private String deadlineDate;

    private String status; // new, in progress, done,etc.

    public Ticket() {
    }

    public Ticket(String taskBody, Long id, String assignedUser, String assignor, String title, LocalDateTime createdTime, String deadlineDate, String status) {
        this.taskBody = taskBody;
        this.id = id;
        this.assignedUser = assignedUser;
        this.assignor = assignor;
        this.title = title;
        this.createdTime = createdTime;
        this.deadlineDate = deadlineDate;
        this.status = status;
    }
}
