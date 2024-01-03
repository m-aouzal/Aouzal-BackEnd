package com.example.emi_flex.service;


import com.example.emi_flex.model.FavoriteMovies;

import com.example.emi_flex.repository.FavoriteMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class FavoriteMoviesService {

    private FavoriteMoviesRepository favoriteMoviesRepository;

    @Autowired
    public FavoriteMoviesService(FavoriteMoviesRepository favoriteMoviesRepository) {
        this.favoriteMoviesRepository = favoriteMoviesRepository;
    }

    public List<FavoriteMovies> getFavoriteMovie() {
        return favoriteMoviesRepository.findAll();
    }

    public List<FavoriteMovies> getFavoriteMoviesByEmail(String email) {
        return favoriteMoviesRepository.findByEmail(email);
    }

    public List<Long> getFavoriteMovieIdsByEmail(String email) {
        List<FavoriteMovies> favoriteMovies = favoriteMoviesRepository.findByEmail(email);
        return favoriteMovies.stream()
                .map(FavoriteMovies::getMovieId)
                .collect(Collectors.toList());
    }

    public FavoriteMovies addFavoriteMovie(FavoriteMovies favoriteMovies) {
        return favoriteMoviesRepository.save(favoriteMovies);
    }





    public void deleteFavoriteMovie(Long movieId) {
        // Find the FavoriteMovies entity by movieId and delete it if it exists
        FavoriteMovies favoriteMovie = favoriteMoviesRepository.findByMovieId(movieId);
        if (favoriteMovie != null) {
            favoriteMoviesRepository.delete(favoriteMovie);
        } else {
        }
    }



    public void deleteFavoriteMovieByEmailAndMovieId(String email, Long movieId) {
        FavoriteMovies favoriteMovie = favoriteMoviesRepository.findByEmailAndMovieId(email, movieId);
        if (favoriteMovie != null) {
            favoriteMoviesRepository.delete(favoriteMovie);
        } else {
            // Handle if the favorite movie by email and movieId doesn't exist
        }
    }
}


