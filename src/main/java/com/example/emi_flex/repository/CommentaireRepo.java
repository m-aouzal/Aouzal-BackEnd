package com.example.emi_flex.repository;

import com.example.emi_flex.model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentaireRepo extends JpaRepository<Commentaire,Long> {
    @Query("SELECT c FROM Commentaire c WHERE c.idfilm = :idfilm")
    List<Commentaire> findCommentaireById_film(Long idfilm);
}
