package com.example.emi_flex.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceCommentaireTest {
    @Autowired
    ServiceCommentaire serviceCommentaire;

    @Test
    void findAllCommentaire() {
        serviceCommentaire.findAllCommentaire();
    }
}