package com.battleships.model;

import com.battleships.model.enums.ShipType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private ShipType name;

    @Column(columnDefinition = "text")
    private String description;

    public Category(ShipType name) {
        this.name = name;
    }
}
