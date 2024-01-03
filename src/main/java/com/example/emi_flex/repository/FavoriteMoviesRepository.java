package com.example.emi_flex.repository;


import com.example.emi_flex.model.FavoriteMovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteMoviesRepository extends JpaRepository<FavoriteMovies, Long> {

    FavoriteMovies findByMovieId(Long movieId);

    List<FavoriteMovies> findByEmail(String email);

    FavoriteMovies findByEmailAndMovieId(String email, Long movieId);
}
