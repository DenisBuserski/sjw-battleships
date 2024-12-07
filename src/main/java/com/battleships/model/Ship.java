package com.battleships.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "ships")
@Getter
@Setter
@NoArgsConstructor
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    private long health;

    private long power;

    private LocalDate created;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

}
