package com.example.emi_flex.service;

import com.example.emi_flex.model.Commentaire;
import com.example.emi_flex.repository.CommentaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCommentaire {
    private final CommentaireRepo commentaireRepo;
    @Autowired
    public ServiceCommentaire(CommentaireRepo commentaireRepo) {

        this.commentaireRepo = commentaireRepo;
    }
    public Commentaire addCommentaire(Commentaire commentaire){

        return commentaireRepo.save(commentaire);
    }
    public List<Commentaire> findAllCommentaire(){

        return commentaireRepo.findAll();
    }
    public void deleteEmployee(Long id){

        commentaireRepo.deleteById(id);
    }
    public List<Commentaire> findCommentaireByIdFilm(Long idfilm){
        return (List<Commentaire>) commentaireRepo.findCommentaireById_film(idfilm);

    }
}
