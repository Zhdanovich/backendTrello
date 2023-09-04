package com.example.DTO;

import com.example.TicketStatus;
import lombok.Data;
import java.time.LocalDateTime;
// class is used to remove unnecessary parameters from Ticket to print out
@Data
public class TicketDto {

    private String taskBody;
    private UserDto assignedUser;
    private UserDto assignor;
    private String title;
    private LocalDateTime deadlineDate;
    private TicketStatus status;
}