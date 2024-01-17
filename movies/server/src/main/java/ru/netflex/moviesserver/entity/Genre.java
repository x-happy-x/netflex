package ru.netflex.moviesserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Genre {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
