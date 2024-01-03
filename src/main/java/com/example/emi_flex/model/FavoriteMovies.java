package com.example.emi_flex.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class FavoriteMovies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Long movieId;

    private String email;
}
