package ru.netflex.moviesserver.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(value = CascadeType.ALL)
    private List<Title> titles;

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade(value = CascadeType.ALL)
    private List<Genre> genres;

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade(value = CascadeType.ALL)
    private List<Country> countries;

    private String director;
    private int releaseYear;
    private int ageLimit;
}
