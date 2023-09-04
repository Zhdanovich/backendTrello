package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    private Long id;

    private String role;

    private String nameSurname;
}
