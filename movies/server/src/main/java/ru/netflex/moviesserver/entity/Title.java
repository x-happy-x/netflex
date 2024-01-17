package ru.netflex.moviesserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Title {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
}
